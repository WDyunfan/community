package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class AticlePictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticlePictureExample() {
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

        public Criteria andAticlePictureIdIsNull() {
            addCriterion("aticle_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdIsNotNull() {
            addCriterion("aticle_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdEqualTo(Integer value) {
            addCriterion("aticle_picture_id =", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdNotEqualTo(Integer value) {
            addCriterion("aticle_picture_id <>", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdGreaterThan(Integer value) {
            addCriterion("aticle_picture_id >", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aticle_picture_id >=", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdLessThan(Integer value) {
            addCriterion("aticle_picture_id <", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("aticle_picture_id <=", value, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdIn(List<Integer> values) {
            addCriterion("aticle_picture_id in", values, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdNotIn(List<Integer> values) {
            addCriterion("aticle_picture_id not in", values, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdBetween(Integer value1, Integer value2) {
            addCriterion("aticle_picture_id between", value1, value2, "aticlePictureId");
            return (Criteria) this;
        }

        public Criteria andAticlePictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aticle_picture_id not between", value1, value2, "aticlePictureId");
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

        public Criteria andAticlePicturePathIsNull() {
            addCriterion("aticle_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathIsNotNull() {
            addCriterion("aticle_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathEqualTo(String value) {
            addCriterion("aticle_picture_path =", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathNotEqualTo(String value) {
            addCriterion("aticle_picture_path <>", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathGreaterThan(String value) {
            addCriterion("aticle_picture_path >", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_picture_path >=", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathLessThan(String value) {
            addCriterion("aticle_picture_path <", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathLessThanOrEqualTo(String value) {
            addCriterion("aticle_picture_path <=", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathLike(String value) {
            addCriterion("aticle_picture_path like", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathNotLike(String value) {
            addCriterion("aticle_picture_path not like", value, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathIn(List<String> values) {
            addCriterion("aticle_picture_path in", values, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathNotIn(List<String> values) {
            addCriterion("aticle_picture_path not in", values, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathBetween(String value1, String value2) {
            addCriterion("aticle_picture_path between", value1, value2, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePicturePathNotBetween(String value1, String value2) {
            addCriterion("aticle_picture_path not between", value1, value2, "aticlePicturePath");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrIsNull() {
            addCriterion("aticle_picture_descr is null");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrIsNotNull() {
            addCriterion("aticle_picture_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrEqualTo(String value) {
            addCriterion("aticle_picture_descr =", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrNotEqualTo(String value) {
            addCriterion("aticle_picture_descr <>", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrGreaterThan(String value) {
            addCriterion("aticle_picture_descr >", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrGreaterThanOrEqualTo(String value) {
            addCriterion("aticle_picture_descr >=", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrLessThan(String value) {
            addCriterion("aticle_picture_descr <", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrLessThanOrEqualTo(String value) {
            addCriterion("aticle_picture_descr <=", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrLike(String value) {
            addCriterion("aticle_picture_descr like", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrNotLike(String value) {
            addCriterion("aticle_picture_descr not like", value, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrIn(List<String> values) {
            addCriterion("aticle_picture_descr in", values, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrNotIn(List<String> values) {
            addCriterion("aticle_picture_descr not in", values, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrBetween(String value1, String value2) {
            addCriterion("aticle_picture_descr between", value1, value2, "aticlePictureDescr");
            return (Criteria) this;
        }

        public Criteria andAticlePictureDescrNotBetween(String value1, String value2) {
            addCriterion("aticle_picture_descr not between", value1, value2, "aticlePictureDescr");
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