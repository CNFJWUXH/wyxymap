package com.wuxh.wyxymap.service;

import com.wuxh.wyxymap.from.SysUserFrom;
import com.wuxh.wyxymap.domin.SysUser;
import com.wuxh.wyxymap.vo.R;
import org.springframework.data.domain.Pageable;


/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysUserService {

    SysUser findByAccount(String account);

    R saveUser(SysUserFrom sysUserFrom);

    R selectUserList(String name, Pageable pageable);

    R selectUserDetail(Integer id);

    R updateUser(SysUserFrom sysUserFrom);

    R delectUser(Integer id);
}
