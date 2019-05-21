package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleExample() {
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

        public Criteria andAticleIdIsNull() {
            addCriterion("aticle_id is null");
            return (Criteria) this;
        }

        public Criteria andAticleIdIsNotNull() {
            addCriterion("aticle_id is not null");
            return (Criteria) this;
        }

        public Criteria andAticleIdEqualTo(Integer value) {
            addCriterion("aticle_id =", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdNotEqualTo(Integer value) {
            addCriterion("aticle_id <>", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdGreaterThan(Integer value) {
            addCriterion("aticle_id >", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_id >=", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdLessThan(Integer value) {
            addCriterion("aticle_id <", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_id <=", value, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdIn(List<Integer> values) {
            addCriterion("aticle_id in", values, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdNotIn(List<Integer> values) {
            addCriterion("aticle_id not in", values, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdBetween(Integer value1, Integer value2) {
            addCriterion("aticle_id between", value1, value2, "aticleId");
            return (Criteria) this;
        }

        public Criteria andAticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_id not between", value1, value2, "aticleId");
            return (Criteria) this;
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

        public Criteria andAticleTitleIsNull() {
            addCriterion("aticle_title is null");
            return (Criteria) this;
        }

        public Criteria andAticleTitleIsNotNull() {
            addCriterion("aticle_title is not null");
            return (Criteria) this;
        }

        public Criteria andAticleTitleEqualTo(String value) {
            addCriterion("aticle_title =", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleNotEqualTo(String value) {
            addCriterion("aticle_title <>", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleGreaterThan(String value) {
            addCriterion("aticle_title >", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_title >=", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleLessThan(String value) {
            addCriterion("aticle_title <", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleLessThanOrEqualTo(String value) {
            addCriterion("aticle_title <=", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleLike(String value) {
            addCriterion("aticle_title like", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleNotLike(String value) {
            addCriterion("aticle_title not like", value, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleIn(List<String> values) {
            addCriterion("aticle_title in", values, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleNotIn(List<String> values) {
            addCriterion("aticle_title not in", values, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleBetween(String value1, String value2) {
            addCriterion("aticle_title between", value1, value2, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleTitleNotBetween(String value1, String value2) {
            addCriterion("aticle_title not between", value1, value2, "aticleTitle");
            return (Criteria) this;
        }

        public Criteria andAticleContentIsNull() {
            addCriterion("aticle_content is null");
            return (Criteria) this;
        }

        public Criteria andAticleContentIsNotNull() {
            addCriterion("aticle_content is not null");
            return (Criteria) this;
        }

        public Criteria andAticleContentEqualTo(String value) {
            addCriterion("aticle_content =", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentNotEqualTo(String value) {
            addCriterion("aticle_content <>", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentGreaterThan(String value) {
            addCriterion("aticle_content >", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_content >=", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentLessThan(String value) {
            addCriterion("aticle_content <", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentLessThanOrEqualTo(String value) {
            addCriterion("aticle_content <=", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentLike(String value) {
            addCriterion("aticle_content like", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentNotLike(String value) {
            addCriterion("aticle_content not like", value, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentIn(List<String> values) {
            addCriterion("aticle_content in", values, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentNotIn(List<String> values) {
            addCriterion("aticle_content not in", values, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentBetween(String value1, String value2) {
            addCriterion("aticle_content between", value1, value2, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleContentNotBetween(String value1, String value2) {
            addCriterion("aticle_content not between", value1, value2, "aticleContent");
            return (Criteria) this;
        }

        public Criteria andAticleTimeIsNull() {
            addCriterion("aticle_time is null");
            return (Criteria) this;
        }

        public Criteria andAticleTimeIsNotNull() {
            addCriterion("aticle_time is not null");
            return (Criteria) this;
        }

        public Criteria andAticleTimeEqualTo(Date value) {
            addCriterion("aticle_time =", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeNotEqualTo(Date value) {
            addCriterion("aticle_time <>", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeGreaterThan(Date value) {
            addCriterion("aticle_time >", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aticle_time >=", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeLessThan(Date value) {
            addCriterion("aticle_time <", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeLessThanOrEqualTo(Date value) {
            addCriterion("aticle_time <=", value, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeIn(List<Date> values) {
            addCriterion("aticle_time in", values, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeNotIn(List<Date> values) {
            addCriterion("aticle_time not in", values, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeBetween(Date value1, Date value2) {
            addCriterion("aticle_time between", value1, value2, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticleTimeNotBetween(Date value1, Date value2) {
            addCriterion("aticle_time not between", value1, value2, "aticleTime");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsIsNull() {
            addCriterion("aticle_pageviews is null");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsIsNotNull() {
            addCriterion("aticle_pageviews is not null");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsEqualTo(Integer value) {
            addCriterion("aticle_pageviews =", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsNotEqualTo(Integer value) {
            addCriterion("aticle_pageviews <>", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsGreaterThan(Integer value) {
            addCriterion("aticle_pageviews >", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_pageviews >=", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsLessThan(Integer value) {
            addCriterion("aticle_pageviews <", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_pageviews <=", value, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsIn(List<Integer> values) {
            addCriterion("aticle_pageviews in", values, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsNotIn(List<Integer> values) {
            addCriterion("aticle_pageviews not in", values, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsBetween(Integer value1, Integer value2) {
            addCriterion("aticle_pageviews between", value1, value2, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticlePageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_pageviews not between", value1, value2, "aticlePageviews");
            return (Criteria) this;
        }

        public Criteria andAticleLikeIsNull() {
            addCriterion("aticle_like is null");
            return (Criteria) this;
        }

        public Criteria andAticleLikeIsNotNull() {
            addCriterion("aticle_like is not null");
            return (Criteria) this;
        }

        public Criteria andAticleLikeEqualTo(Integer value) {
            addCriterion("aticle_like =", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeNotEqualTo(Integer value) {
            addCriterion("aticle_like <>", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeGreaterThan(Integer value) {
            addCriterion("aticle_like >", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_like >=", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeLessThan(Integer value) {
            addCriterion("aticle_like <", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_like <=", value, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeIn(List<Integer> values) {
            addCriterion("aticle_like in", values, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeNotIn(List<Integer> values) {
            addCriterion("aticle_like not in", values, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeBetween(Integer value1, Integer value2) {
            addCriterion("aticle_like between", value1, value2, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_like not between", value1, value2, "aticleLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeIsNull() {
            addCriterion("aticle_commentvolume is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeIsNotNull() {
            addCriterion("aticle_commentvolume is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeEqualTo(Integer value) {
            addCriterion("aticle_commentvolume =", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeNotEqualTo(Integer value) {
            addCriterion("aticle_commentvolume <>", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeGreaterThan(Integer value) {
            addCriterion("aticle_commentvolume >", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_commentvolume >=", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeLessThan(Integer value) {
            addCriterion("aticle_commentvolume <", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_commentvolume <=", value, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeIn(List<Integer> values) {
            addCriterion("aticle_commentvolume in", values, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeNotIn(List<Integer> values) {
            addCriterion("aticle_commentvolume not in", values, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeBetween(Integer value1, Integer value2) {
            addCriterion("aticle_commentvolume between", value1, value2, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleCommentvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_commentvolume not between", value1, value2, "aticleCommentvolume");
            return (Criteria) this;
        }

        public Criteria andAticleTypeIsNull() {
            addCriterion("aticle_type is null");
            return (Criteria) this;
        }

        public Criteria andAticleTypeIsNotNull() {
            addCriterion("aticle_type is not null");
            return (Criteria) this;
        }

        public Criteria andAticleTypeEqualTo(String value) {
            addCriterion("aticle_type =", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeNotEqualTo(String value) {
            addCriterion("aticle_type <>", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeGreaterThan(String value) {
            addCriterion("aticle_type >", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_type >=", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeLessThan(String value) {
            addCriterion("aticle_type <", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeLessThanOrEqualTo(String value) {
            addCriterion("aticle_type <=", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeLike(String value) {
            addCriterion("aticle_type like", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeNotLike(String value) {
            addCriterion("aticle_type not like", value, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeIn(List<String> values) {
            addCriterion("aticle_type in", values, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeNotIn(List<String> values) {
            addCriterion("aticle_type not in", values, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeBetween(String value1, String value2) {
            addCriterion("aticle_type between", value1, value2, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleTypeNotBetween(String value1, String value2) {
            addCriterion("aticle_type not between", value1, value2, "aticleType");
            return (Criteria) this;
        }

        public Criteria andAticleDescrIsNull() {
            addCriterion("aticle_descr is null");
            return (Criteria) this;
        }

        public Criteria andAticleDescrIsNotNull() {
            addCriterion("aticle_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAticleDescrEqualTo(String value) {
            addCriterion("aticle_descr =", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrNotEqualTo(String value) {
            addCriterion("aticle_descr <>", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrGreaterThan(String value) {
            addCriterion("aticle_descr >", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_descr >=", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrLessThan(String value) {
            addCriterion("aticle_descr <", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrLessThanOrEqualTo(String value) {
            addCriterion("aticle_descr <=", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrLike(String value) {
            addCriterion("aticle_descr like", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrNotLike(String value) {
            addCriterion("aticle_descr not like", value, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrIn(List<String> values) {
            addCriterion("aticle_descr in", values, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrNotIn(List<String> values) {
            addCriterion("aticle_descr not in", values, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrBetween(String value1, String value2) {
            addCriterion("aticle_descr between", value1, value2, "aticleDescr");
            return (Criteria) this;
        }

        public Criteria andAticleDescrNotBetween(String value1, String value2) {
            addCriterion("aticle_descr not between", value1, value2, "aticleDescr");
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