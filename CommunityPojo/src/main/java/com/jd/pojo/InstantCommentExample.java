package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstantCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstantCommentExample() {
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

        public Criteria andInstantCommentImgIsNull() {
            addCriterion("instant_comment_img is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgIsNotNull() {
            addCriterion("instant_comment_img is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgEqualTo(String value) {
            addCriterion("instant_comment_img =", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgNotEqualTo(String value) {
            addCriterion("instant_comment_img <>", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgGreaterThan(String value) {
            addCriterion("instant_comment_img >", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgGreaterThanOrEqualTo(String value) {
            addCriterion("instant_comment_img >=", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgLessThan(String value) {
            addCriterion("instant_comment_img <", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgLessThanOrEqualTo(String value) {
            addCriterion("instant_comment_img <=", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgLike(String value) {
            addCriterion("instant_comment_img like", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgNotLike(String value) {
            addCriterion("instant_comment_img not like", value, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgIn(List<String> values) {
            addCriterion("instant_comment_img in", values, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgNotIn(List<String> values) {
            addCriterion("instant_comment_img not in", values, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgBetween(String value1, String value2) {
            addCriterion("instant_comment_img between", value1, value2, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentImgNotBetween(String value1, String value2) {
            addCriterion("instant_comment_img not between", value1, value2, "instantCommentImg");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentIsNull() {
            addCriterion("instant_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentIsNotNull() {
            addCriterion("instant_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentEqualTo(String value) {
            addCriterion("instant_comment_content =", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentNotEqualTo(String value) {
            addCriterion("instant_comment_content <>", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentGreaterThan(String value) {
            addCriterion("instant_comment_content >", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("instant_comment_content >=", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentLessThan(String value) {
            addCriterion("instant_comment_content <", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentLessThanOrEqualTo(String value) {
            addCriterion("instant_comment_content <=", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentLike(String value) {
            addCriterion("instant_comment_content like", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentNotLike(String value) {
            addCriterion("instant_comment_content not like", value, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentIn(List<String> values) {
            addCriterion("instant_comment_content in", values, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentNotIn(List<String> values) {
            addCriterion("instant_comment_content not in", values, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentBetween(String value1, String value2) {
            addCriterion("instant_comment_content between", value1, value2, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentContentNotBetween(String value1, String value2) {
            addCriterion("instant_comment_content not between", value1, value2, "instantCommentContent");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeIsNull() {
            addCriterion("instant_comment_like is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeIsNotNull() {
            addCriterion("instant_comment_like is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeEqualTo(Integer value) {
            addCriterion("instant_comment_like =", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeNotEqualTo(Integer value) {
            addCriterion("instant_comment_like <>", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeGreaterThan(Integer value) {
            addCriterion("instant_comment_like >", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_comment_like >=", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeLessThan(Integer value) {
            addCriterion("instant_comment_like <", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeLessThanOrEqualTo(Integer value) {
            addCriterion("instant_comment_like <=", value, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeIn(List<Integer> values) {
            addCriterion("instant_comment_like in", values, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeNotIn(List<Integer> values) {
            addCriterion("instant_comment_like not in", values, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeBetween(Integer value1, Integer value2) {
            addCriterion("instant_comment_like between", value1, value2, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_comment_like not between", value1, value2, "instantCommentLike");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeIsNull() {
            addCriterion("instant_comment_type is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeIsNotNull() {
            addCriterion("instant_comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeEqualTo(String value) {
            addCriterion("instant_comment_type =", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeNotEqualTo(String value) {
            addCriterion("instant_comment_type <>", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeGreaterThan(String value) {
            addCriterion("instant_comment_type >", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("instant_comment_type >=", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeLessThan(String value) {
            addCriterion("instant_comment_type <", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeLessThanOrEqualTo(String value) {
            addCriterion("instant_comment_type <=", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeLike(String value) {
            addCriterion("instant_comment_type like", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeNotLike(String value) {
            addCriterion("instant_comment_type not like", value, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeIn(List<String> values) {
            addCriterion("instant_comment_type in", values, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeNotIn(List<String> values) {
            addCriterion("instant_comment_type not in", values, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeBetween(String value1, String value2) {
            addCriterion("instant_comment_type between", value1, value2, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTypeNotBetween(String value1, String value2) {
            addCriterion("instant_comment_type not between", value1, value2, "instantCommentType");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeIsNull() {
            addCriterion("instant_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeIsNotNull() {
            addCriterion("instant_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeEqualTo(Date value) {
            addCriterion("instant_comment_time =", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeNotEqualTo(Date value) {
            addCriterion("instant_comment_time <>", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeGreaterThan(Date value) {
            addCriterion("instant_comment_time >", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("instant_comment_time >=", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeLessThan(Date value) {
            addCriterion("instant_comment_time <", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("instant_comment_time <=", value, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeIn(List<Date> values) {
            addCriterion("instant_comment_time in", values, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeNotIn(List<Date> values) {
            addCriterion("instant_comment_time not in", values, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeBetween(Date value1, Date value2) {
            addCriterion("instant_comment_time between", value1, value2, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andInstantCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("instant_comment_time not between", value1, value2, "instantCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommentDescrIsNull() {
            addCriterion("comment_descr is null");
            return (Criteria) this;
        }

        public Criteria andCommentDescrIsNotNull() {
            addCriterion("comment_descr is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDescrEqualTo(String value) {
            addCriterion("comment_descr =", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrNotEqualTo(String value) {
            addCriterion("comment_descr <>", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrGreaterThan(String value) {
            addCriterion("comment_descr >", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrGreaterThanOrEqualTo(String value) {
            addCriterion("comment_descr >=", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrLessThan(String value) {
            addCriterion("comment_descr <", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrLessThanOrEqualTo(String value) {
            addCriterion("comment_descr <=", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrLike(String value) {
            addCriterion("comment_descr like", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrNotLike(String value) {
            addCriterion("comment_descr not like", value, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrIn(List<String> values) {
            addCriterion("comment_descr in", values, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrNotIn(List<String> values) {
            addCriterion("comment_descr not in", values, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrBetween(String value1, String value2) {
            addCriterion("comment_descr between", value1, value2, "commentDescr");
            return (Criteria) this;
        }

        public Criteria andCommentDescrNotBetween(String value1, String value2) {
            addCriterion("comment_descr not between", value1, value2, "commentDescr");
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