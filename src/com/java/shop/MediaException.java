package com.java.shop;

public class MediaException extends Exception {

    public MediaException () {

    }

    public MediaException (Media med) {
        super(med.toString());
    }

    public MediaException (String description) {
        super(description);
    }

}

// créer MediaException qui dérive de Exception
// lever l'exception dans Cart.remove() (impossible de remove un item qui n'existe pas)
// Cart.totalNetPrice() (impossible que le prix soit inférieur ou égal à zéro)
// MediaRow.decrement() (impossible d'avoir une quantity inférieure à un)