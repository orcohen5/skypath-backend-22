package spic.backend.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spic.backend.icd.Category;
import spic.backend.icd.Photo;
import spic.backend.icd.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
public class PhotosController {

    @GetMapping("/users/{userId}/category/{categoryName}")
    @ResponseBody
    public List<Photo> getPhotosByCategory(@PathVariable String userId, @PathVariable String categoryName) {
        List<Photo> list = new ArrayList<>();
        //list.add(new Photo("Food", "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"));
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/users/{userId}/{category}/addPic",
            consumes = { MediaType.MULTIPART_FORM_DATA_VALUE})
    public void addNewPhoto(@ModelAttribute Request request) {
        byte[] fileContent = new byte[0];
        try {
            fileContent = FileUtils.readFileToByteArray(request.getImage());
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            Photo photo = new Photo(request.getTitle(), encodedString);

        } catch (IOException e) {
            System.out.println("Error while getting image");
        }
    }

    @RequestMapping(method = RequestMethod.POST, path = "/users/{userId}/{category}/deletePic")
    public void deletePhoto() {

    }
}
