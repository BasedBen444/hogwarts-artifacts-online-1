package edu.tcu.cs.hogwartsartifactonline1.security;

import edu.tcu.cs.hogwartsartifactonline1.hogwartsuser.HogwartsUser;
import edu.tcu.cs.hogwartsartifactonline1.hogwartsuser.MyUserPrincipal;
import edu.tcu.cs.hogwartsartifactonline1.hogwartsuser.converter.UserToUserDtoConverter;
import edu.tcu.cs.hogwartsartifactonline1.hogwartsuser.dto.UserDto;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {
    private final JwtProvider jwtProvider;

    private final UserToUserDtoConverter userToUserDtoConverter;

    public AuthService(JwtProvider jwtProvider, UserToUserDtoConverter userToUserDtoConverter) {
        this.jwtProvider = jwtProvider;
        this.userToUserDtoConverter = userToUserDtoConverter;
    }

    public Map<String, Object> createLoginInfo(Authentication authentication) {
        //User Info
        MyUserPrincipal principal = (MyUserPrincipal) authentication.getPrincipal();
        HogwartsUser hogwartsUser = principal.getHogwartsUser();
        UserDto userDto = userToUserDtoConverter.convert(hogwartsUser);
        //JWT
        String token = this.jwtProvider.createToken(authentication);

        Map<String, Object> loginResultMap = new HashMap<>();

        loginResultMap.put("userInfo", userDto);
        loginResultMap.put("token", token);

        return loginResultMap;
    }
}
