package com.example.oneanothercookbook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.DataQueryBuilder;

import java.util.List;

public class ReceptBluda {
    private String kratkoeOpisanie;
    private String polnoeOpisanie;
    private String nazvanie;
    private Double serialVersionUID;
    private java.util.Date created;
    private String objectId;
    private String foto;
    private String ownerId;
    private java.util.Date updated;
    private java.util.List<IngredientRecepta> receptIngredienty;
    private java.util.List<EtapGotovki> receptEtapy;

    public ReceptBluda() {
    }

    public ReceptBluda(String nazvanie, String kratkoeOpisanie, String polnoeOpisanie) {
        this.kratkoeOpisanie = kratkoeOpisanie;
        this.polnoeOpisanie = polnoeOpisanie;
        this.nazvanie = nazvanie;
    }

    public String getKratkoeOpisanie() {
        return kratkoeOpisanie;
    }

    public void setKratkoeOpisanie(String kratkoeOpisanie) {
        this.kratkoeOpisanie = kratkoeOpisanie;
    }

    public String getPolnoeOpisanie() {
        return polnoeOpisanie;
    }

    public void setPolnoeOpisanie(String polnoeOpisanie) {
        this.polnoeOpisanie = polnoeOpisanie;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public Double getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(Double serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public java.util.Date getCreated() {
        return created;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public java.util.Date getUpdated() {
        return updated;
    }

    public java.util.List<IngredientRecepta> getReceptIngredienty() {
        return receptIngredienty;
    }

    public void setReceptIngredienty(java.util.List<IngredientRecepta> receptIngredienty) {
        this.receptIngredienty = receptIngredienty;
    }

    public java.util.List<EtapGotovki> getReceptEtapy() {
        return receptEtapy;
    }

    public void setReceptEtapy(java.util.List<EtapGotovki> receptEtapy) {
        this.receptEtapy = receptEtapy;
    }


    public ReceptBluda save() {
        return Backendless.Data.of(ReceptBluda.class).save(this);
    }

    public void saveAsync(AsyncCallback<ReceptBluda> callback) {
        Backendless.Data.of(ReceptBluda.class).save(this, callback);
    }

    public Long remove() {
        return Backendless.Data.of(ReceptBluda.class).remove(this);
    }

    public void removeAsync(AsyncCallback<Long> callback) {
        Backendless.Data.of(ReceptBluda.class).remove(this, callback);
    }

    public static ReceptBluda findById(String id) {
        return Backendless.Data.of(ReceptBluda.class).findById(id);
    }

    public static void findByIdAsync(String id, AsyncCallback<ReceptBluda> callback) {
        Backendless.Data.of(ReceptBluda.class).findById(id, callback);
    }

    public static ReceptBluda findFirst() {
        return Backendless.Data.of(ReceptBluda.class).findFirst();
    }

    public static void findFirstAsync(AsyncCallback<ReceptBluda> callback) {
        Backendless.Data.of(ReceptBluda.class).findFirst(callback);
    }

    public static ReceptBluda findLast() {
        return Backendless.Data.of(ReceptBluda.class).findLast();
    }

    public static void findLastAsync(AsyncCallback<ReceptBluda> callback) {
        Backendless.Data.of(ReceptBluda.class).findLast(callback);
    }

    public static List<ReceptBluda> find(DataQueryBuilder queryBuilder) {
        return Backendless.Data.of(ReceptBluda.class).find(queryBuilder);
    }

    public static void findAsync(DataQueryBuilder queryBuilder, AsyncCallback<List<ReceptBluda>> callback) {
        Backendless.Data.of(ReceptBluda.class).find(queryBuilder, callback);
    }

}