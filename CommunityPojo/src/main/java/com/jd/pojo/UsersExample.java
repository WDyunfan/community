package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNull() {
            addCriterion("users_name is null");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNotNull() {
            addCriterion("users_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNameEqualTo(String value) {
            addCriterion("users_name =", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotEqualTo(String value) {
            addCriterion("users_name <>", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThan(String value) {
            addCriterion("users_name >", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThanOrEqualTo(String value) {
            addCriterion("users_name >=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThan(String value) {
            addCriterion("users_name <", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThanOrEqualTo(String value) {
            addCriterion("users_name <=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLike(String value) {
            addCriterion("users_name like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotLike(String value) {
            addCriterion("users_name not like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameIn(List<String> values) {
            addCriterion("users_name in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotIn(List<String> values) {
            addCriterion("users_name not in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameBetween(String value1, String value2) {
            addCriterion("users_name between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotBetween(String value1, String value2) {
            addCriterion("users_name not between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersPassIsNull() {
            addCriterion("users_pass is null");
            return (Criteria) this;
        }

        public Criteria andUsersPassIsNotNull() {
            addCriterion("users_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPassEqualTo(String value) {
            addCriterion("users_pass =", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotEqualTo(String value) {
            addCriterion("users_pass <>", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassGreaterThan(String value) {
            addCriterion("users_pass >", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassGreaterThanOrEqualTo(String value) {
            addCriterion("users_pass >=", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLessThan(String value) {
            addCriterion("users_pass <", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLessThanOrEqualTo(String value) {
            addCriterion("users_pass <=", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLike(String value) {
            addCriterion("users_pass like", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotLike(String value) {
            addCriterion("users_pass not like", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassIn(List<String> values) {
            addCriterion("users_pass in", values, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotIn(List<String> values) {
            addCriterion("users_pass not in", values, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassBetween(String value1, String value2) {
            addCriterion("users_pass between", value1, value2, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotBetween(String value1, String value2) {
            addCriterion("users_pass not between", value1, value2, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersImgIsNull() {
            addCriterion("users_img is null");
            return (Criteria) this;
        }

        public Criteria andUsersImgIsNotNull() {
            addCriterion("users_img is not null");
            return (Criteria) this;
        }

        public Criteria andUsersImgEqualTo(String value) {
            addCriterion("users_img =", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotEqualTo(String value) {
            addCriterion("users_img <>", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgGreaterThan(String value) {
            addCriterion("users_img >", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgGreaterThanOrEqualTo(String value) {
            addCriterion("users_img >=", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLessThan(String value) {
            addCriterion("users_img <", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLessThanOrEqualTo(String value) {
            addCriterion("users_img <=", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLike(String value) {
            addCriterion("users_img like", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotLike(String value) {
            addCriterion("users_img not like", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgIn(List<String> values) {
            addCriterion("users_img in", values, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotIn(List<String> values) {
            addCriterion("users_img not in", values, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgBetween(String value1, String value2) {
            addCriterion("users_img between", value1, value2, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotBetween(String value1, String value2) {
            addCriterion("users_img not between", value1, value2, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIsNull() {
            addCriterion("users_introduce is null");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIsNotNull() {
            addCriterion("users_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceEqualTo(String value) {
            addCriterion("users_introduce =", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotEqualTo(String value) {
            addCriterion("users_introduce <>", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceGreaterThan(String value) {
            addCriterion("users_introduce >", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("users_introduce >=", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLessThan(String value) {
            addCriterion("users_introduce <", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLessThanOrEqualTo(String value) {
            addCriterion("users_introduce <=", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLike(String value) {
            addCriterion("users_introduce like", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotLike(String value) {
            addCriterion("users_introduce not like", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIn(List<String> values) {
            addCriterion("users_introduce in", values, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotIn(List<String> values) {
            addCriterion("users_introduce not in", values, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceBetween(String value1, String value2) {
            addCriterion("users_introduce between", value1, value2, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotBetween(String value1, String value2) {
            addCriterion("users_introduce not between", value1, value2, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceIsNull() {
            addCriterion("users_experience is null");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceIsNotNull() {
            addCriterion("users_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceEqualTo(String value) {
            addCriterion("users_experience =", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceNotEqualTo(String value) {
            addCriterion("users_experience <>", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceGreaterThan(String value) {
            addCriterion("users_experience >", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("users_experience >=", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceLessThan(String value) {
            addCriterion("users_experience <", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceLessThanOrEqualTo(String value) {
            addCriterion("users_experience <=", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceLike(String value) {
            addCriterion("users_experience like", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceNotLike(String value) {
            addCriterion("users_experience not like", value, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceIn(List<String> values) {
            addCriterion("users_experience in", values, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceNotIn(List<String> values) {
            addCriterion("users_experience not in", values, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceBetween(String value1, String value2) {
            addCriterion("users_experience between", value1, value2, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersExperienceNotBetween(String value1, String value2) {
            addCriterion("users_experience not between", value1, value2, "usersExperience");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeIsNull() {
            addCriterion("users_thememode is null");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeIsNotNull() {
            addCriterion("users_thememode is not null");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeEqualTo(String value) {
            addCriterion("users_thememode =", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeNotEqualTo(String value) {
            addCriterion("users_thememode <>", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeGreaterThan(String value) {
            addCriterion("users_thememode >", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeGreaterThanOrEqualTo(String value) {
            addCriterion("users_thememode >=", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeLessThan(String value) {
            addCriterion("users_thememode <", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeLessThanOrEqualTo(String value) {
            addCriterion("users_thememode <=", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeLike(String value) {
            addCriterion("users_thememode like", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeNotLike(String value) {
            addCriterion("users_thememode not like", value, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeIn(List<String> values) {
            addCriterion("users_thememode in", values, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeNotIn(List<String> values) {
            addCriterion("users_thememode not in", values, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeBetween(String value1, String value2) {
            addCriterion("users_thememode between", value1, value2, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersThememodeNotBetween(String value1, String value2) {
            addCriterion("users_thememode not between", value1, value2, "usersThememode");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumIsNull() {
            addCriterion("users_album is null");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumIsNotNull() {
            addCriterion("users_album is not null");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumEqualTo(String value) {
            addCriterion("users_album =", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumNotEqualTo(String value) {
            addCriterion("users_album <>", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumGreaterThan(String value) {
            addCriterion("users_album >", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumGreaterThanOrEqualTo(String value) {
            addCriterion("users_album >=", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumLessThan(String value) {
            addCriterion("users_album <", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumLessThanOrEqualTo(String value) {
            addCriterion("users_album <=", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumLike(String value) {
            addCriterion("users_album like", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumNotLike(String value) {
            addCriterion("users_album not like", value, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumIn(List<String> values) {
            addCriterion("users_album in", values, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumNotIn(List<String> values) {
            addCriterion("users_album not in", values, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumBetween(String value1, String value2) {
            addCriterion("users_album between", value1, value2, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersAlbumNotBetween(String value1, String value2) {
            addCriterion("users_album not between", value1, value2, "usersAlbum");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeIsNull() {
            addCriterion("users_registertime is null");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeIsNotNull() {
            addCriterion("users_registertime is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeEqualTo(Date value) {
            addCriterion("users_registertime =", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeNotEqualTo(Date value) {
            addCriterion("users_registertime <>", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeGreaterThan(Date value) {
            addCriterion("users_registertime >", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("users_registertime >=", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeLessThan(Date value) {
            addCriterion("users_registertime <", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("users_registertime <=", value, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeIn(List<Date> values) {
            addCriterion("users_registertime in", values, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeNotIn(List<Date> values) {
            addCriterion("users_registertime not in", values, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeBetween(Date value1, Date value2) {
            addCriterion("users_registertime between", value1, value2, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("users_registertime not between", value1, value2, "usersRegistertime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeIsNull() {
            addCriterion("users_logintime is null");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeIsNotNull() {
            addCriterion("users_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeEqualTo(Date value) {
            addCriterion("users_logintime =", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeNotEqualTo(Date value) {
            addCriterion("users_logintime <>", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeGreaterThan(Date value) {
            addCriterion("users_logintime >", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("users_logintime >=", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeLessThan(Date value) {
            addCriterion("users_logintime <", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("users_logintime <=", value, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeIn(List<Date> values) {
            addCriterion("users_logintime in", values, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeNotIn(List<Date> values) {
            addCriterion("users_logintime not in", values, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeBetween(Date value1, Date value2) {
            addCriterion("users_logintime between", value1, value2, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("users_logintime not between", value1, value2, "usersLogintime");
            return (Criteria) this;
        }

        public Criteria andUsersDescrIsNull() {
            addCriterion("users_descr is null");
            return (Criteria) this;
        }

        public Criteria andUsersDescrIsNotNull() {
            addCriterion("users_descr is not null");
            return (Criteria) this;
        }

        public Criteria andUsersDescrEqualTo(String value) {
            addCriterion("users_descr =", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrNotEqualTo(String value) {
            addCriterion("users_descr <>", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrGreaterThan(String value) {
            addCriterion("users_descr >", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrGreaterThanOrEqualTo(String value) {
            addCriterion("users_descr >=", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrLessThan(String value) {
            addCriterion("users_descr <", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrLessThanOrEqualTo(String value) {
            addCriterion("users_descr <=", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrLike(String value) {
            addCriterion("users_descr like", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrNotLike(String value) {
            addCriterion("users_descr not like", value, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrIn(List<String> values) {
            addCriterion("users_descr in", values, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrNotIn(List<String> values) {
            addCriterion("users_descr not in", values, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrBetween(String value1, String value2) {
            addCriterion("users_descr between", value1, value2, "usersDescr");
            return (Criteria) this;
        }

        public Criteria andUsersDescrNotBetween(String value1, String value2) {
            addCriterion("users_descr not between", value1, value2, "usersDescr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}