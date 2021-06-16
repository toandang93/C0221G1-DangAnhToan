package com.service.impl;

import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Override
    public String change(String name) {
        String[] viet = {"xin chào","tạm biệt","hát","bay","nhảy"};
        String[] anh = {"hello","goodbye","sing","ply","jump"};
        boolean check = false;
        String result = "";
        for (int i =0;i<anh.length;i++){
            if (anh[i].equals(name)){
               result = viet[i];
                check = true;
            }
        }
        if (!check){
            result = "Not found!";
        }
        return result;
    }
}
