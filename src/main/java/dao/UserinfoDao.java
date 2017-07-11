package dao;

import entity.Userinfo;
import entity.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by 12917 on 2017/6/11.
 */
@Repository
public class UserinfoDao {
    public UserinfoMapper getUserinfoMapper() {
        return userinfoMapper;
    }

    public void setUserinfoMapper(UserinfoMapper userinfoMapper) {
        this.userinfoMapper = userinfoMapper;
    }

    @Autowired
    private UserinfoMapper userinfoMapper;
    public void insertUserinfo(Userinfo userinfo){
        userinfoMapper.insert(userinfo);
    }


}
