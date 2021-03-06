package com.wuxh.wyxymap.repository;

import com.wuxh.wyxymap.domin.SysRoleResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysRoleResourceRepository extends JpaRepository<SysRoleResource,Integer> {

    List<SysRoleResource> findByRoleId(Integer roleId);

    List<SysRoleResource> findByRoleId(List<Integer> roleIds);

    void deleteByRoleId(Integer id);
}
