package cc.nireus.simple.mapper;

import cc.nireus.simple.model.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Insert("INSERT INTO account(username, email, password, status) " +
            "VALUES(#{username}, #{email}, #{password}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Account account);

    @Delete("DELETE FROM account WHERE id = #{id}")
    int deleteById(Long id);

    @Update("UPDATE account SET username = #{username}, email = #{email}, " +
            "password = #{password}, status = #{status} WHERE id = #{id}")
    int update(Account account);

    @Select("SELECT * FROM account WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "status", column = "status")
    })
    Account findById(Long id);

    @Select("SELECT * FROM account")
    List<Account> findAll();
}