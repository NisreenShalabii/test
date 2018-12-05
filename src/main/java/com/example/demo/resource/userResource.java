package com.example.demo.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = " userResource",description = "it shows user resource")

public class userResource {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("asma", 1000L),
                new User("slam", 8000L)
        );
    }

        @GetMapping("/{userName}")
         public User getUser(@PathVariable final String userName ){
            return  new User(userName,1000L);
        }

    @ApiOperation(" post the request billing")
    @PostMapping("/postReq")
    public String UserRequestPost(@RequestBody final String hello){
        return hello ;
    }

    @ApiOperation("update users request")
    @PutMapping("/updateReq ")
    public String marketPut(@RequestBody final String hello){
        return hello ;
    }


}
