package com.wuxh.wyxymap.controller;

import com.wuxh.wyxymap.domin.Place;
import com.wuxh.wyxymap.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/admin/place")
    public String toPlace(Model model){
        Place p = new Place();
        model.addAttribute("place",p);
        model.addAttribute("msg","");
        model.addAttribute("placeList",placeService.getAllPlace());
        return "admin/place";
    }

    @RequestMapping("/admin/addPlace")
    public String addPlace(Place place, Model model){
        Place p = placeService.addPlace(place);
        String msg = "";
        if(null != p){
            model.addAttribute("place",p);
            msg = "Add place success!";
        }else{
            msg = "Add place fail!";
        }
        model.addAttribute("msg",msg);
        model.addAttribute("placeList",placeService.getAllPlace());
        return "admin/place";
    }

    @RequestMapping("/admin/deletePlace")
    public String deletePlace(Model model, Long id){
        placeService.deletePlaceById(id);
        String msg = "Place delete success!";
        Place p = new Place();
        model.addAttribute("place",p);
        model.addAttribute("msg",msg);
        model.addAttribute("placeList",placeService.getAllPlace());
        return "admin/place";
    }

    @RequestMapping("/admin/editPlace")
    public String editPlace(Model model, Place place){
        placeService.editPlace(place);
        String msg = "Place update success!";
        Place p = new Place();
        model.addAttribute("place",p);
        model.addAttribute("msg",msg);
        model.addAttribute("placeList",placeService.getAllPlace());
        return "admin/place";
    }

    @RequestMapping("getPlaceAjax")
    @ResponseBody
    public List<Place> getPlaceAjax(){
        return placeService.getAllPlace();
    }

    @RequestMapping("/goPlaceDetail")
    public  String goPlaceDetail(Model model, Long id){
        Place p = new Place();
        p = placeService.getPlace(id);
        model.addAttribute("place", p);
        return "placeDetail";
    }
}
