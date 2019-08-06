package com.wuxh.wyxymap;

import com.wuxh.wyxymap.domin.SysResource;
import com.wuxh.wyxymap.domin.SysRole;
import com.wuxh.wyxymap.from.SysRoleFrom;
import com.wuxh.wyxymap.from.SysUserFrom;
import com.wuxh.wyxymap.repository.SysResourceRepository;
import com.wuxh.wyxymap.repository.SysRoleRepository;
import com.wuxh.wyxymap.service.SysRoleService;
import com.wuxh.wyxymap.service.SysUserService;
import com.wuxh.wyxymap.service.impl.SysRoleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WyxymapApplicationTests {

    @Autowired
    private SysResourceRepository sysResourceRepository;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        //SysResource sysResource = new SysResource();
        //sysResource.setName("插入");
        //sysResource.setPerms("insert");
        //sysResourceRepository.save(sysResource);

        /*SysRoleFrom sysRoleFrom = new SysRoleFrom();
        sysRoleFrom.setName("admin");
        sysRoleFrom.setGrade(1);
        List<SysResource> sysResources = new ArrayList<SysResource>();
        sysResources.add(sysResourceRepository.getOne(1));
        sysRoleFrom.setSysResources(sysResources);

        sysRoleService.saveRole(sysRoleFrom);*/

        SysUserFrom userFrom = new SysUserFrom();
        userFrom.setName("wuyiqingchuang");
        userFrom.setAccount("wuyiqingchuang");
        userFrom.setPassword("513qingchuang");
        userFrom.setForbidden("0");
        List<SysRole> roleList = new ArrayList<SysRole>();
        roleList.add(sysRoleRepository.getOne(2));
        userFrom.setSysRoles(roleList);

        sysUserService.saveUser(userFrom);

    }

}
