package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstantResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstantResponseExample() {
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

        public Criteria andInstantResponseIdIsNull() {
            addCriterion("instant_response_id is null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdIsNotNull() {
            addCriterion("instant_response_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdEqualTo(Integer value) {
            addCriterion("instant_response_id =", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdNotEqualTo(Integer value) {
            addCriterion("instant_response_id <>", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdGreaterThan(Integer value) {
            addCriterion("instant_response_id >", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_response_id >=", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdLessThan(Integer value) {
            addCriterion("instant_response_id <", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdLessThanOrEqualTo(Integer value) {
            addCriterion("instant_response_id <=", value, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdIn(List<Integer> values) {
            addCriterion("instant_response_id in", values, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdNotIn(List<Integer> values) {
            addCriterion("instant_response_id not in", values, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdBetween(Integer value1, Integer value2) {
            addCriterion("instant_response_id between", value1, value2, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantResponseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_response_id not between", value1, value2, "instantResponseId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdIsNull() {
            addCriterion("instant_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdIsNotNull() {
            addCriterion("instant_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdEqualTo(Integer value) {
            addCriterion("instant_comment_id =", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdNotEqualTo(Integer value) {
            addCriterion("instant_comment_id <>", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdGreaterThan(Integer value) {
            addCriterion("instant_comment_id >", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_comment_id >=", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdLessThan(Integer value) {
            addCriterion("instant_comment_id <", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("instant_comment_id <=", value, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdIn(List<Integer> values) {
            addCriterion("instant_comment_id in", values, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdNotIn(List<Integer> values) {
            addCriterion("instant_comment_id not in", values, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("instant_comment_id between", value1, value2, "instantCommentId");
            return (Criteria) this;
        }

        public Criteria andInstantCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_comment_id not between", value1, value2, "instantCommentId");
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

        public Criteria andInstantResponseImgIsNull() {
            addCriterion("instant_response_img is null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgIsNotNull() {
            addCriterion("instant_response_img is not null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgEqualTo(String value) {
            addCriterion("instant_response_img =", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgNotEqualTo(String value) {
            addCriterion("instant_response_img <>", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgGreaterThan(String value) {
            addCriterion("instant_response_img >", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgGreaterThanOrEqualTo(String value) {
            addCriterion("instant_response_img >=", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgLessThan(String value) {
            addCriterion("instant_response_img <", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgLessThanOrEqualTo(String value) {
            addCriterion("instant_response_img <=", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgLike(String value) {
            addCriterion("instant_response_img like", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgNotLike(String value) {
            addCriterion("instant_response_img not like", value, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgIn(List<String> values) {
            addCriterion("instant_response_img in", values, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgNotIn(List<String> values) {
            addCriterion("instant_response_img not in", values, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgBetween(String value1, String value2) {
            addCriterion("instant_response_img between", value1, value2, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseImgNotBetween(String value1, String value2) {
            addCriterion("instant_response_img not between", value1, value2, "instantResponseImg");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentIsNull() {
            addCriterion("instant_response_content is null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentIsNotNull() {
            addCriterion("instant_response_content is not null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentEqualTo(String value) {
            addCriterion("instant_response_content =", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentNotEqualTo(String value) {
            addCriterion("instant_response_content <>", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentGreaterThan(String value) {
            addCriterion("instant_response_content >", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("instant_response_content >=", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentLessThan(String value) {
            addCriterion("instant_response_content <", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentLessThanOrEqualTo(String value) {
            addCriterion("instant_response_content <=", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentLike(String value) {
            addCriterion("instant_response_content like", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentNotLike(String value) {
            addCriterion("instant_response_content not like", value, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentIn(List<String> values) {
            addCriterion("instant_response_content in", values, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentNotIn(List<String> values) {
            addCriterion("instant_response_content not in", values, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentBetween(String value1, String value2) {
            addCriterion("instant_response_content between", value1, value2, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseContentNotBetween(String value1, String value2) {
            addCriterion("instant_response_content not between", value1, value2, "instantResponseContent");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeIsNull() {
            addCriterion("instant_response_time is null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeIsNotNull() {
            addCriterion("instant_response_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeEqualTo(Date value) {
            addCriterion("instant_response_time =", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeNotEqualTo(Date value) {
            addCriterion("instant_response_time <>", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeGreaterThan(Date value) {
            addCriterion("instant_response_time >", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("instant_response_time >=", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeLessThan(Date value) {
            addCriterion("instant_response_time <", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("instant_response_time <=", value, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeIn(List<Date> values) {
            addCriterion("instant_response_time in", values, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeNotIn(List<Date> values) {
            addCriterion("instant_response_time not in", values, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeBetween(Date value1, Date value2) {
            addCriterion("instant_response_time between", value1, value2, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("instant_response_time not between", value1, value2, "instantResponseTime");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrIsNull() {
            addCriterion("instant_response_descr is null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrIsNotNull() {
            addCriterion("instant_response_descr is not null");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrEqualTo(String value) {
            addCriterion("instant_response_descr =", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrNotEqualTo(String value) {
            addCriterion("instant_response_descr <>", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrGreaterThan(String value) {
            addCriterion("instant_response_descr >", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrGreaterThanOrEqualTo(String value) {
            addCriterion("instant_response_descr >=", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrLessThan(String value) {
            addCriterion("instant_response_descr <", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrLessThanOrEqualTo(String value) {
            addCriterion("instant_response_descr <=", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrLike(String value) {
            addCriterion("instant_response_descr like", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrNotLike(String value) {
            addCriterion("instant_response_descr not like", value, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrIn(List<String> values) {
            addCriterion("instant_response_descr in", values, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrNotIn(List<String> values) {
            addCriterion("instant_response_descr not in", values, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrBetween(String value1, String value2) {
            addCriterion("instant_response_descr between", value1, value2, "instantResponseDescr");
            return (Criteria) this;
        }

        public Criteria andInstantResponseDescrNotBetween(String value1, String value2) {
            addCriterion("instant_response_descr not between", value1, value2, "instantResponseDescr");
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