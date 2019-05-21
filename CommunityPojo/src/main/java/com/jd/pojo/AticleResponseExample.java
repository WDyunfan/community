package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleResponseExample() {
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

        public Criteria andAticleResponseIdIsNull() {
            addCriterion("aticle_response_id is null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdIsNotNull() {
            addCriterion("aticle_response_id is not null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdEqualTo(Integer value) {
            addCriterion("aticle_response_id =", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdNotEqualTo(Integer value) {
            addCriterion("aticle_response_id <>", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdGreaterThan(Integer value) {
            addCriterion("aticle_response_id >", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_response_id >=", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdLessThan(Integer value) {
            addCriterion("aticle_response_id <", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_response_id <=", value, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdIn(List<Integer> values) {
            addCriterion("aticle_response_id in", values, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdNotIn(List<Integer> values) {
            addCriterion("aticle_response_id not in", values, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdBetween(Integer value1, Integer value2) {
            addCriterion("aticle_response_id between", value1, value2, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleResponseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_response_id not between", value1, value2, "aticleResponseId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdIsNull() {
            addCriterion("aticle_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdIsNotNull() {
            addCriterion("aticle_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdEqualTo(Integer value) {
            addCriterion("aticle_comment_id =", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdNotEqualTo(Integer value) {
            addCriterion("aticle_comment_id <>", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdGreaterThan(Integer value) {
            addCriterion("aticle_comment_id >", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_comment_id >=", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdLessThan(Integer value) {
            addCriterion("aticle_comment_id <", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_comment_id <=", value, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdIn(List<Integer> values) {
            addCriterion("aticle_comment_id in", values, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdNotIn(List<Integer> values) {
            addCriterion("aticle_comment_id not in", values, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("aticle_comment_id between", value1, value2, "aticleCommentId");
            return (Criteria) this;
        }

        public Criteria andAticleCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_comment_id not between", value1, value2, "aticleCommentId");
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

        public Criteria andAticleResponseTimeIsNull() {
            addCriterion("aticle_response_time is null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeIsNotNull() {
            addCriterion("aticle_response_time is not null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeEqualTo(Date value) {
            addCriterion("aticle_response_time =", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeNotEqualTo(Date value) {
            addCriterion("aticle_response_time <>", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeGreaterThan(Date value) {
            addCriterion("aticle_response_time >", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aticle_response_time >=", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeLessThan(Date value) {
            addCriterion("aticle_response_time <", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("aticle_response_time <=", value, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeIn(List<Date> values) {
            addCriterion("aticle_response_time in", values, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeNotIn(List<Date> values) {
            addCriterion("aticle_response_time not in", values, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeBetween(Date value1, Date value2) {
            addCriterion("aticle_response_time between", value1, value2, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("aticle_response_time not between", value1, value2, "aticleResponseTime");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentIsNull() {
            addCriterion("aticle_response_content is null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentIsNotNull() {
            addCriterion("aticle_response_content is not null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentEqualTo(String value) {
            addCriterion("aticle_response_content =", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentNotEqualTo(String value) {
            addCriterion("aticle_response_content <>", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentGreaterThan(String value) {
            addCriterion("aticle_response_content >", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_response_content >=", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentLessThan(String value) {
            addCriterion("aticle_response_content <", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentLessThanOrEqualTo(String value) {
            addCriterion("aticle_response_content <=", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentLike(String value) {
            addCriterion("aticle_response_content like", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentNotLike(String value) {
            addCriterion("aticle_response_content not like", value, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentIn(List<String> values) {
            addCriterion("aticle_response_content in", values, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentNotIn(List<String> values) {
            addCriterion("aticle_response_content not in", values, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentBetween(String value1, String value2) {
            addCriterion("aticle_response_content between", value1, value2, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseContentNotBetween(String value1, String value2) {
            addCriterion("aticle_response_content not between", value1, value2, "aticleResponseContent");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgIsNull() {
            addCriterion("aticle_response_img is null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgIsNotNull() {
            addCriterion("aticle_response_img is not null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgEqualTo(String value) {
            addCriterion("aticle_response_img =", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgNotEqualTo(String value) {
            addCriterion("aticle_response_img <>", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgGreaterThan(String value) {
            addCriterion("aticle_response_img >", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_response_img >=", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgLessThan(String value) {
            addCriterion("aticle_response_img <", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgLessThanOrEqualTo(String value) {
            addCriterion("aticle_response_img <=", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgLike(String value) {
            addCriterion("aticle_response_img like", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgNotLike(String value) {
            addCriterion("aticle_response_img not like", value, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgIn(List<String> values) {
            addCriterion("aticle_response_img in", values, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgNotIn(List<String> values) {
            addCriterion("aticle_response_img not in", values, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgBetween(String value1, String value2) {
            addCriterion("aticle_response_img between", value1, value2, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseImgNotBetween(String value1, String value2) {
            addCriterion("aticle_response_img not between", value1, value2, "aticleResponseImg");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrIsNull() {
            addCriterion("aticle_response_descr is null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrIsNotNull() {
            addCriterion("aticle_response_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrEqualTo(String value) {
            addCriterion("aticle_response_descr =", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrNotEqualTo(String value) {
            addCriterion("aticle_response_descr <>", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrGreaterThan(String value) {
            addCriterion("aticle_response_descr >", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_response_descr >=", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrLessThan(String value) {
            addCriterion("aticle_response_descr <", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrLessThanOrEqualTo(String value) {
            addCriterion("aticle_response_descr <=", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrLike(String value) {
            addCriterion("aticle_response_descr like", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrNotLike(String value) {
            addCriterion("aticle_response_descr not like", value, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrIn(List<String> values) {
            addCriterion("aticle_response_descr in", values, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrNotIn(List<String> values) {
            addCriterion("aticle_response_descr not in", values, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrBetween(String value1, String value2) {
            addCriterion("aticle_response_descr between", value1, value2, "aticleResponseDescr");
            return (Criteria) this;
        }

        public Criteria andAticleResponseDescrNotBetween(String value1, String value2) {
            addCriterion("aticle_response_descr not between", value1, value2, "aticleResponseDescr");
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