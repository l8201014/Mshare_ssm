package com.zwn.model;

public class Movietype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column movietype.mtid
     *
     * @mbggenerated
     */
    private Integer mtid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column movietype.typename
     *
     * @mbggenerated
     */
    private String typename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column movietype.mtid
     *
     * @return the value of movietype.mtid
     *
     * @mbggenerated
     */
    public Integer getMtid() {
        return mtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column movietype.mtid
     *
     * @param mtid the value for movietype.mtid
     *
     * @mbggenerated
     */
    public void setMtid(Integer mtid) {
        this.mtid = mtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column movietype.typename
     *
     * @return the value of movietype.typename
     *
     * @mbggenerated
     */
    public String getTypename() {
        return typename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column movietype.typename
     *
     * @param typename the value for movietype.typename
     *
     * @mbggenerated
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}