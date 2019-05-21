package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeavemessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeavemessageExample() {
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

        public Criteria andLeavemessageIdIsNull() {
            addCriterion("leavemessage_id is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdIsNotNull() {
            addCriterion("leavemessage_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdEqualTo(Integer value) {
            addCriterion("leavemessage_id =", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdNotEqualTo(Integer value) {
            addCriterion("leavemessage_id <>", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdGreaterThan(Integer value) {
            addCriterion("leavemessage_id >", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leavemessage_id >=", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdLessThan(Integer value) {
            addCriterion("leavemessage_id <", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("leavemessage_id <=", value, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdIn(List<Integer> values) {
            addCriterion("leavemessage_id in", values, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdNotIn(List<Integer> values) {
            addCriterion("leavemessage_id not in", values, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdBetween(Integer value1, Integer value2) {
            addCriterion("leavemessage_id between", value1, value2, "leavemessageId");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leavemessage_id not between", value1, value2, "leavemessageId");
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

        public Criteria andLeavemessageContentIsNull() {
            addCriterion("leavemessage_content is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentIsNotNull() {
            addCriterion("leavemessage_content is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentEqualTo(String value) {
            addCriterion("leavemessage_content =", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentNotEqualTo(String value) {
            addCriterion("leavemessage_content <>", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentGreaterThan(String value) {
            addCriterion("leavemessage_content >", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("leavemessage_content >=", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentLessThan(String value) {
            addCriterion("leavemessage_content <", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentLessThanOrEqualTo(String value) {
            addCriterion("leavemessage_content <=", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentLike(String value) {
            addCriterion("leavemessage_content like", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentNotLike(String value) {
            addCriterion("leavemessage_content not like", value, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentIn(List<String> values) {
            addCriterion("leavemessage_content in", values, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentNotIn(List<String> values) {
            addCriterion("leavemessage_content not in", values, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentBetween(String value1, String value2) {
            addCriterion("leavemessage_content between", value1, value2, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageContentNotBetween(String value1, String value2) {
            addCriterion("leavemessage_content not between", value1, value2, "leavemessageContent");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeIsNull() {
            addCriterion("leavemessage_time is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeIsNotNull() {
            addCriterion("leavemessage_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeEqualTo(Date value) {
            addCriterion("leavemessage_time =", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeNotEqualTo(Date value) {
            addCriterion("leavemessage_time <>", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeGreaterThan(Date value) {
            addCriterion("leavemessage_time >", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leavemessage_time >=", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeLessThan(Date value) {
            addCriterion("leavemessage_time <", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("leavemessage_time <=", value, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeIn(List<Date> values) {
            addCriterion("leavemessage_time in", values, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeNotIn(List<Date> values) {
            addCriterion("leavemessage_time not in", values, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeBetween(Date value1, Date value2) {
            addCriterion("leavemessage_time between", value1, value2, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("leavemessage_time not between", value1, value2, "leavemessageTime");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceIsNull() {
            addCriterion("leavemessage_experience is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceIsNotNull() {
            addCriterion("leavemessage_experience is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceEqualTo(String value) {
            addCriterion("leavemessage_experience =", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceNotEqualTo(String value) {
            addCriterion("leavemessage_experience <>", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceGreaterThan(String value) {
            addCriterion("leavemessage_experience >", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("leavemessage_experience >=", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceLessThan(String value) {
            addCriterion("leavemessage_experience <", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceLessThanOrEqualTo(String value) {
            addCriterion("leavemessage_experience <=", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceLike(String value) {
            addCriterion("leavemessage_experience like", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceNotLike(String value) {
            addCriterion("leavemessage_experience not like", value, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceIn(List<String> values) {
            addCriterion("leavemessage_experience in", values, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceNotIn(List<String> values) {
            addCriterion("leavemessage_experience not in", values, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceBetween(String value1, String value2) {
            addCriterion("leavemessage_experience between", value1, value2, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageExperienceNotBetween(String value1, String value2) {
            addCriterion("leavemessage_experience not between", value1, value2, "leavemessageExperience");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeIsNull() {
            addCriterion("leavemessage_like is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeIsNotNull() {
            addCriterion("leavemessage_like is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeEqualTo(Integer value) {
            addCriterion("leavemessage_like =", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeNotEqualTo(Integer value) {
            addCriterion("leavemessage_like <>", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeGreaterThan(Integer value) {
            addCriterion("leavemessage_like >", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leavemessage_like >=", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeLessThan(Integer value) {
            addCriterion("leavemessage_like <", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeLessThanOrEqualTo(Integer value) {
            addCriterion("leavemessage_like <=", value, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeIn(List<Integer> values) {
            addCriterion("leavemessage_like in", values, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeNotIn(List<Integer> values) {
            addCriterion("leavemessage_like not in", values, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeBetween(Integer value1, Integer value2) {
            addCriterion("leavemessage_like between", value1, value2, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("leavemessage_like not between", value1, value2, "leavemessageLike");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrIsNull() {
            addCriterion("leavemessage_descr is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrIsNotNull() {
            addCriterion("leavemessage_descr is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrEqualTo(String value) {
            addCriterion("leavemessage_descr =", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrNotEqualTo(String value) {
            addCriterion("leavemessage_descr <>", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrGreaterThan(String value) {
            addCriterion("leavemessage_descr >", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrGreaterThanOrEqualTo(String value) {
            addCriterion("leavemessage_descr >=", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrLessThan(String value) {
            addCriterion("leavemessage_descr <", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrLessThanOrEqualTo(String value) {
            addCriterion("leavemessage_descr <=", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrLike(String value) {
            addCriterion("leavemessage_descr like", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrNotLike(String value) {
            addCriterion("leavemessage_descr not like", value, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrIn(List<String> values) {
            addCriterion("leavemessage_descr in", values, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrNotIn(List<String> values) {
            addCriterion("leavemessage_descr not in", values, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrBetween(String value1, String value2) {
            addCriterion("leavemessage_descr between", value1, value2, "leavemessageDescr");
            return (Criteria) this;
        }

        public Criteria andLeavemessageDescrNotBetween(String value1, String value2) {
            addCriterion("leavemessage_descr not between", value1, value2, "leavemessageDescr");
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