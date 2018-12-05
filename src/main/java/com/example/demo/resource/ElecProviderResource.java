package com.example.demo.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/rest/elecProvider")
@Api(value = " marketResource",description = "get electricity request from the market")
public class ElecProviderResource {

    @ApiOperation("get electricity request ")
    @ApiResponses(value={
            @ApiResponse(code =100,message=" market didn't pay for Electricity "),
            @ApiResponse(code =200,message="it is successful process")
    })
    @GetMapping//get method
    public String  elecProvider() {//response body code 200

        return "ElecProvider ";
    }
    @ApiOperation(" post the billing")
    @PostMapping("/post")
    public String elecProviderPost(@RequestBody final String hello){
        return hello ;
    }
//    @ApiOperation("")
//    @PutMapping("/put")
//    public String elecProviderPut(@RequestBody final String hello){
//        return hello ;
//    }
//

}