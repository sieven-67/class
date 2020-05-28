package com.lq.facelogin.Service;

import com.lq.facelogin.Face.BaiduAIFace;
import com.lq.facelogin.SetingModel.Setingmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class FaceService {
    @Autowired
    BaiduAIFace faceapi;
    @Autowired
    Setingmodel setingmodel;
    public Map<String,Object> searchface(StringBuffer imagebase64) throws IOException {
        String substring = imagebase64.substring(imagebase64.indexOf(",")+1, imagebase64.length());
        setingmodel.setImgpath(substring);
        setingmodel.setGroupID("face");
        System.out.println(substring);
        Map map = faceapi.FaceSearch(setingmodel);
        return map;

    }
}
