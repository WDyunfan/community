package com.jd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.dao.LeavemessageMapper;
import com.jd.pojo.Leavemessage;
import com.jd.pojo.LeavemessageExample;

@Service
public class LeavemessageServiceImpl implements LeavemessageService {

	@Autowired
	private LeavemessageMapper leavemessageMapper;
	
	@Override
	public int countByExample(LeavemessageExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteByExample(LeavemessageExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByPrimaryKey(Integer leavemessageId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Leavemessage record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertSelective(Leavemessage record) {
		return leavemessageMapper.insertSelective(record) > 0;
	}

	@Override
	public List<Leavemessage> selectByExample(LeavemessageExample example) {
		return leavemessageMapper.selectByExample(example);
	}

	@Override
	public Leavemessage selectByPrimaryKey(Integer leavemessageId) {
		return leavemessageMapper.selectByPrimaryKey(leavemessageId);
	}

	@Override
	public boolean updateByExampleSelective(Leavemessage record, LeavemessageExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByExample(Leavemessage record, LeavemessageExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByPrimaryKeySelective(Leavemessage record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByPrimaryKey(Leavemessage record) {
		// TODO Auto-generated method stub
		return false;
	}

}
