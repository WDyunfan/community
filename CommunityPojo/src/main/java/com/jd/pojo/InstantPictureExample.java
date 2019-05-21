package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class InstantPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstantPictureExample() {
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

        public Criteria andInstantPictureIdIsNull() {
            addCriterion("instant_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdIsNotNull() {
            addCriterion("instant_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdEqualTo(Integer value) {
            addCriterion("instant_picture_id =", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdNotEqualTo(Integer value) {
            addCriterion("instant_picture_id <>", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdGreaterThan(Integer value) {
            addCriterion("instant_picture_id >", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_picture_id >=", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdLessThan(Integer value) {
            addCriterion("instant_picture_id <", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("instant_picture_id <=", value, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdIn(List<Integer> values) {
            addCriterion("instant_picture_id in", values, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdNotIn(List<Integer> values) {
            addCriterion("instant_picture_id not in", values, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("instant_picture_id between", value1, value2, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_picture_id not between", value1, value2, "instantPictureId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdIsNull() {
            addCriterion("instant_message_id is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdIsNotNull() {
            addCriterion("instant_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdEqualTo(Integer value) {
            addCriterion("instant_message_id =", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotEqualTo(Integer value) {
            addCriterion("instant_message_id <>", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdGreaterThan(Integer value) {
            addCriterion("instant_message_id >", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_message_id >=", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdLessThan(Integer value) {
            addCriterion("instant_message_id <", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("instant_message_id <=", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdIn(List<Integer> values) {
            addCriterion("instant_message_id in", values, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotIn(List<Integer> values) {
            addCriterion("instant_message_id not in", values, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_id between", value1, value2, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_id not between", value1, value2, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathIsNull() {
            addCriterion("instant_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathIsNotNull() {
            addCriterion("instant_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathEqualTo(String value) {
            addCriterion("instant_picture_path =", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathNotEqualTo(String value) {
            addCriterion("instant_picture_path <>", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathGreaterThan(String value) {
            addCriterion("instant_picture_path >", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("instant_picture_path >=", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathLessThan(String value) {
            addCriterion("instant_picture_path <", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathLessThanOrEqualTo(String value) {
            addCriterion("instant_picture_path <=", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathLike(String value) {
            addCriterion("instant_picture_path like", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathNotLike(String value) {
            addCriterion("instant_picture_path not like", value, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathIn(List<String> values) {
            addCriterion("instant_picture_path in", values, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathNotIn(List<String> values) {
            addCriterion("instant_picture_path not in", values, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathBetween(String value1, String value2) {
            addCriterion("instant_picture_path between", value1, value2, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPicturePathNotBetween(String value1, String value2) {
            addCriterion("instant_picture_path not between", value1, value2, "instantPicturePath");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrIsNull() {
            addCriterion("instant_picture_descr is null");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrIsNotNull() {
            addCriterion("instant_picture_descr is not null");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrEqualTo(String value) {
            addCriterion("instant_picture_descr =", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrNotEqualTo(String value) {
            addCriterion("instant_picture_descr <>", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrGreaterThan(String value) {
            addCriterion("instant_picture_descr >", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrGreaterThanOrEqualTo(String value) {
            addCriterion("instant_picture_descr >=", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrLessThan(String value) {
            addCriterion("instant_picture_descr <", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrLessThanOrEqualTo(String value) {
            addCriterion("instant_picture_descr <=", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrLike(String value) {
            addCriterion("instant_picture_descr like", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrNotLike(String value) {
            addCriterion("instant_picture_descr not like", value, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrIn(List<String> values) {
            addCriterion("instant_picture_descr in", values, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrNotIn(List<String> values) {
            addCriterion("instant_picture_descr not in", values, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrBetween(String value1, String value2) {
            addCriterion("instant_picture_descr between", value1, value2, "instantPictureDescr");
            return (Criteria) this;
        }

        public Criteria andInstantPictureDescrNotBetween(String value1, String value2) {
            addCriterion("instant_picture_descr not between", value1, value2, "instantPictureDescr");
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