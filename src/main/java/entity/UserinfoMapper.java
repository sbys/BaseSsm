package entity;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    Userinfo selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Userinfo record);
}