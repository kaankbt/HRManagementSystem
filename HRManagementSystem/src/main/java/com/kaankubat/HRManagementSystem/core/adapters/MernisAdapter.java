package com.kaankubat.HRManagementSystem.core.adapters;

import com.kaankubat.HRManagementSystem.core.results.ErrorResult;
import com.kaankubat.HRManagementSystem.core.results.Result;
import com.kaankubat.HRManagementSystem.core.results.SuccessResult;
import com.kaankubat.HRManagementSystem.entitiy.concretes.JobSeeker;
import org.springframework.stereotype.Service;

@Service
public class MernisAdapter {

    public Result isValid(JobSeeker jobSeeker) {
        Mernis mernis = new Mernis();
        long longTC = Long.parseLong(String.valueOf(jobSeeker.getIdentity_number()));
        Boolean result = mernis.validate(longTC, jobSeeker.getFirst_name(), jobSeeker.getLast_name(), jobSeeker.getDate().getYear());
        if (result) {
            return new SuccessResult();
        } else {
            return new ErrorResult();
        }
    }

}