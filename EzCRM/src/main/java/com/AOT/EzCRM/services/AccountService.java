package com.AOT.EzCRM.services;



import com.AOT.EzCRM.dtos.UserGetDto;
import com.AOT.EzCRM.dtos.UserPostDto;
import com.AOT.EzCRM.entities.UserEntity;
import com.AOT.EzCRM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    UserRepository userRepository;

    public UserGetDto createUser(UserPostDto userPostDto){

        UserEntity userEntity = this.mapPostDtoEntity(userPostDto);
        UserEntity saveUserEntity = userRepository.save(userEntity);

        UserGetDto userGetDto = this.mapEntityToGetDto(saveUserEntity);

        return  userGetDto;
    }


    private UserEntity mapPostDtoEntity(UserPostDto userPostDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userPostDto.getFirstName());
        userEntity.setPassword(userPostDto.getPassword());

        return userEntity;
    }

    private UserGetDto mapEntityToGetDto(UserEntity userEntity){
        UserGetDto userGetDto = new UserGetDto();
        userGetDto.setId(userEntity.getId().toString());
        userGetDto.setFirstName(userEntity.getFirstName());

        return  userGetDto;
    }
}
