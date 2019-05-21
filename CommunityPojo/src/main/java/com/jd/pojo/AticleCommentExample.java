package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleCommentExample() {
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

        public Criteria andAticleCommentTimeIsNull() {
            addCriterion("aticle_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeIsNotNull() {
            addCriterion("aticle_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeEqualTo(Date value) {
            addCriterion("aticle_comment_time =", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeNotEqualTo(Date value) {
            addCriterion("aticle_comment_time <>", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeGreaterThan(Date value) {
            addCriterion("aticle_comment_time >", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aticle_comment_time >=", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeLessThan(Date value) {
            addCriterion("aticle_comment_time <", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("aticle_comment_time <=", value, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeIn(List<Date> values) {
            addCriterion("aticle_comment_time in", values, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeNotIn(List<Date> values) {
            addCriterion("aticle_comment_time not in", values, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeBetween(Date value1, Date value2) {
            addCriterion("aticle_comment_time between", value1, value2, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("aticle_comment_time not between", value1, value2, "aticleCommentTime");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentIsNull() {
            addCriterion("aticle_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentIsNotNull() {
            addCriterion("aticle_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentEqualTo(String value) {
            addCriterion("aticle_comment_content =", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentNotEqualTo(String value) {
            addCriterion("aticle_comment_content <>", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentGreaterThan(String value) {
            addCriterion("aticle_comment_content >", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_comment_content >=", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentLessThan(String value) {
            addCriterion("aticle_comment_content <", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentLessThanOrEqualTo(String value) {
            addCriterion("aticle_comment_content <=", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentLike(String value) {
            addCriterion("aticle_comment_content like", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentNotLike(String value) {
            addCriterion("aticle_comment_content not like", value, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentIn(List<String> values) {
            addCriterion("aticle_comment_content in", values, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentNotIn(List<String> values) {
            addCriterion("aticle_comment_content not in", values, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentBetween(String value1, String value2) {
            addCriterion("aticle_comment_content between", value1, value2, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentContentNotBetween(String value1, String value2) {
            addCriterion("aticle_comment_content not between", value1, value2, "aticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeIsNull() {
            addCriterion("aticle_comment_like is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeIsNotNull() {
            addCriterion("aticle_comment_like is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeEqualTo(Integer value) {
            addCriterion("aticle_comment_like =", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeNotEqualTo(Integer value) {
            addCriterion("aticle_comment_like <>", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeGreaterThan(Integer value) {
            addCriterion("aticle_comment_like >", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_comment_like >=", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeLessThan(Integer value) {
            addCriterion("aticle_comment_like <", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_comment_like <=", value, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeIn(List<Integer> values) {
            addCriterion("aticle_comment_like in", values, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeNotIn(List<Integer> values) {
            addCriterion("aticle_comment_like not in", values, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeBetween(Integer value1, Integer value2) {
            addCriterion("aticle_comment_like between", value1, value2, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_comment_like not between", value1, value2, "aticleCommentLike");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeIsNull() {
            addCriterion("aticle_comment_type is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeIsNotNull() {
            addCriterion("aticle_comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeEqualTo(String value) {
            addCriterion("aticle_comment_type =", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeNotEqualTo(String value) {
            addCriterion("aticle_comment_type <>", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeGreaterThan(String value) {
            addCriterion("aticle_comment_type >", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_comment_type >=", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeLessThan(String value) {
            addCriterion("aticle_comment_type <", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeLessThanOrEqualTo(String value) {
            addCriterion("aticle_comment_type <=", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeLike(String value) {
            addCriterion("aticle_comment_type like", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeNotLike(String value) {
            addCriterion("aticle_comment_type not like", value, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeIn(List<String> values) {
            addCriterion("aticle_comment_type in", values, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeNotIn(List<String> values) {
            addCriterion("aticle_comment_type not in", values, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeBetween(String value1, String value2) {
            addCriterion("aticle_comment_type between", value1, value2, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentTypeNotBetween(String value1, String value2) {
            addCriterion("aticle_comment_type not between", value1, value2, "aticleCommentType");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgIsNull() {
            addCriterion("aticle_comment_img is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgIsNotNull() {
            addCriterion("aticle_comment_img is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgEqualTo(String value) {
            addCriterion("aticle_comment_img =", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgNotEqualTo(String value) {
            addCriterion("aticle_comment_img <>", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgGreaterThan(String value) {
            addCriterion("aticle_comment_img >", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_comment_img >=", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgLessThan(String value) {
            addCriterion("aticle_comment_img <", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgLessThanOrEqualTo(String value) {
            addCriterion("aticle_comment_img <=", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgLike(String value) {
            addCriterion("aticle_comment_img like", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgNotLike(String value) {
            addCriterion("aticle_comment_img not like", value, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgIn(List<String> values) {
            addCriterion("aticle_comment_img in", values, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgNotIn(List<String> values) {
            addCriterion("aticle_comment_img not in", values, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgBetween(String value1, String value2) {
            addCriterion("aticle_comment_img between", value1, value2, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentImgNotBetween(String value1, String value2) {
            addCriterion("aticle_comment_img not between", value1, value2, "aticleCommentImg");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrIsNull() {
            addCriterion("aticle_comment_descr is null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrIsNotNull() {
            addCriterion("aticle_comment_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrEqualTo(String value) {
            addCriterion("aticle_comment_descr =", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrNotEqualTo(String value) {
            addCriterion("aticle_comment_descr <>", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrGreaterThan(String value) {
            addCriterion("aticle_comment_descr >", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_comment_descr >=", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrLessThan(String value) {
            addCriterion("aticle_comment_descr <", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrLessThanOrEqualTo(String value) {
            addCriterion("aticle_comment_descr <=", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrLike(String value) {
            addCriterion("aticle_comment_descr like", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrNotLike(String value) {
            addCriterion("aticle_comment_descr not like", value, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrIn(List<String> values) {
            addCriterion("aticle_comment_descr in", values, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrNotIn(List<String> values) {
            addCriterion("aticle_comment_descr not in", values, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrBetween(String value1, String value2) {
            addCriterion("aticle_comment_descr between", value1, value2, "aticleCommentDescr");
            return (Criteria) this;
        }

        public Criteria andAticleCommentDescrNotBetween(String value1, String value2) {
            addCriterion("aticle_comment_descr not between", value1, value2, "aticleCommentDescr");
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