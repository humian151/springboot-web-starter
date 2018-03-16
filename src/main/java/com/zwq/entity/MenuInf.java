package com.zwq.entity;

import javax.persistence.*;

@Table(name = "menu_inf")
public class MenuInf {
    @Id
    private Long id;

    /**
     * 菜单代码
     */
    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 菜单活动
     */
    @Column(name = "menu_action")
    private String menuAction;

    /**
     * 是否子叶菜单，0否，1是
     */
    private String isleaf;

    /**
     * 菜单级别
     */
    @Column(name = "menu_level")
    private String menuLevel;

    /**
     * 父节点代码
     */
    @Column(name = "parent_sid")
    private Long parentSid;

    /**
     * 是否可见，0忽略，1可见
     */
    private String visible;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取菜单代码
     *
     * @return menu_id - 菜单代码
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单代码
     *
     * @param menuId 菜单代码
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取菜单活动
     *
     * @return menu_action - 菜单活动
     */
    public String getMenuAction() {
        return menuAction;
    }

    /**
     * 设置菜单活动
     *
     * @param menuAction 菜单活动
     */
    public void setMenuAction(String menuAction) {
        this.menuAction = menuAction;
    }

    /**
     * 获取是否子叶菜单，0否，1是
     *
     * @return isleaf - 是否子叶菜单，0否，1是
     */
    public String getIsleaf() {
        return isleaf;
    }

    /**
     * 设置是否子叶菜单，0否，1是
     *
     * @param isleaf 是否子叶菜单，0否，1是
     */
    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf;
    }

    /**
     * 获取菜单级别
     *
     * @return menu_level - 菜单级别
     */
    public String getMenuLevel() {
        return menuLevel;
    }

    /**
     * 设置菜单级别
     *
     * @param menuLevel 菜单级别
     */
    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * 获取父节点代码
     *
     * @return parent_sid - 父节点代码
     */
    public Long getParentSid() {
        return parentSid;
    }

    /**
     * 设置父节点代码
     *
     * @param parentSid 父节点代码
     */
    public void setParentSid(Long parentSid) {
        this.parentSid = parentSid;
    }

    /**
     * 获取是否可见，0忽略，1可见
     *
     * @return visible - 是否可见，0忽略，1可见
     */
    public String getVisible() {
        return visible;
    }

    /**
     * 设置是否可见，0忽略，1可见
     *
     * @param visible 是否可见，0忽略，1可见
     */
    public void setVisible(String visible) {
        this.visible = visible;
    }
}