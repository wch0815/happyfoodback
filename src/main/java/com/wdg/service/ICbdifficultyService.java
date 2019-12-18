package com.wdg.service;

import com.wdg.pojo.Cbdifficulty;


import java.util.List;

public interface ICbdifficultyService {

    List<Cbdifficulty> getAllCbdifficulty();

    boolean saveCbdifficulty(Cbdifficulty cbdifficulty);

    boolean updateCbdifficulty(Cbdifficulty cbdifficulty);

    boolean deleteCbdifficultyByUid(int cbdid);
}
