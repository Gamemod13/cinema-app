package cinema.app.service.impl;

import cinema.app.dao.RoleDao;
import cinema.app.model.Role;
import cinema.app.service.RoleService;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName)).orElseThrow(
                () -> new NoSuchElementException("Can't found role by name: " + roleName));
    }
}
