package com.wdg.service;

import com.wdg.pojo.Cbcratf;

import java.util.List;


public interface ICbcratfService {
    List<Cbcratf> getAllCbcratf();

    boolean saveCbcratf(Cbcratf cbcratf);

    boolean updateCbcratf(Cbcratf cbcratf);

    boolean deleteCbcratfByUid(int cbcid);
}
