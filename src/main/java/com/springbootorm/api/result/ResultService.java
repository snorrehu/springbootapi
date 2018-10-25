package com.springbootorm.api.result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    //Create
    public void addResult(Result result){
        resultRepository.save(result);
    }

    //Read all
    public List<Result> getAllResults(){
        List<Result> results = new ArrayList<>();
        resultRepository.findAll().forEach(results::add);
        return results;
    }

    //Read one
    public ArrayList<Result> getResult(Integer id){
        ArrayList<Result> resultList = new ArrayList<>();
        resultList.add(resultRepository.findById(id).get());
        return resultList;
    }

    //Update
    public void updateResult(Result result, Integer id) {
        resultRepository.save(result);
    }

    //Delete
    public void deleteResult(Integer id) {
        Result resultToDelete = resultRepository.findById(id).get();
        resultToDelete.setActivity(false);
        updateResult(resultToDelete,id);    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return resultRepository.existsById(id);
    }
    
}
