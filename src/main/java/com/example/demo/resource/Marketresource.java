package com.example.demo.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/rest/market")
@Api(value = " marketResource",description = "get electricity request to post the billing required")
public class Marketresource {

    @ApiOperation("get electricity request to post the billing required")
    @ApiResponses(value={
            @ApiResponse(code =100,message="user didn't pay for Electricity "),
            @ApiResponse(code =200,message="it is successful process")
    })

    @GetMapping//get method
    public String market() {//response body code 200
        userResource userResource= new userResource();

        return Arrays.toString(userResource.getUsers().toArray());
    }
    @ApiOperation("post the billing required")
    @PostMapping("/post")
    public String marketPost(@RequestBody final String hello){
        return hello ;
    }
    @ApiOperation("Update request to provider")
    @PutMapping("/put")
    public String marketPut(@RequestBody final String hello){
        return hello ;
    }


}