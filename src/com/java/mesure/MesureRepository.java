package com.java.mesure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MesureRepository implements IMesureRepository {

    private List<Double> theoricalList = new ArrayList<>();
    private List<Double> mesureList = new ArrayList<>();

    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();
        while(line != null) {
            StringTokenizer st = new StringTokenizer(line,";");
            st.nextToken();
            Double theorical = Double.parseDouble(st.nextToken());
            Double mesure = Double.parseDouble(st.nextToken());
            theoricalList.add(theorical);
            mesureList.add(mesure);
            line = reader.readLine();
        }
    }

    @Override
    public List<Double> getTheoricalList() {
        return theoricalList;
    }

    @Override
    public List<Double> getMesureList() {
        return mesureList;
    }

    @Override
    public List<Double> getDifferenceList() {
        List<Double> res = new ArrayList<>();
        for(int i = 0; i<mesureList.size()-1; i++){
            res.add(theoricalList.get(i)-mesureList.get(i));
        }
        return res;
    }

    @Override
    public List<Double> getQuadraticList() {
        List<Double> res = new ArrayList<>();
        for(int i = 0; i<mesureList.size()-1; i++){
            res.add(Math.pow((getDifferenceList().get(i)), 2));
        }
        return res;
    }

    @Override
    public List<Integer> getTimeDifferenceErrorList(double delta) {
        return(getTimeDifferenceErrorList(delta, getDifferenceList()));
    }

    private List<Integer> getTimeDifferenceErrorList(double delta, List<Double> list) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            if(Math.abs(list.get(i)) >= delta) {
                res.add(i);
            }
        }
        return res;
    }

    @Override
    public List<Integer> getTimeQuatraticErrorList(double delta) {
        return(getTimeDifferenceErrorList(delta, getQuadraticList()));
    }
}
}