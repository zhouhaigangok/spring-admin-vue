package com.ifsaid.shark.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

/**
 * All rights Reserved, Designed By www.ifsaid.com
 * <p>
 *
 * </p>
 *
 * @author Wang Chen Chen<932560435@qq.com>
 * @version 2.0
 * @date 2019/12/12 21:31
 * @copyright 2019 http://www.ifsaid.com/ Inc. All rights reserved.
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeNode implements java.io.Serializable {

    /**
     * 获取 当前节点 ID
     *
     * @return int
     * @author Wang Chen Chen<932560435@qq.com>
     * @date 2019/12/12 21:32
     */
    private int id;

    /**
     * 当前节点标题
     *
     * @return int
     * @author Wang Chen Chen<932560435@qq.com>
     * @date 2019/12/12 21:32
     */
    private String title;

    /**
     * 上级节点 ID
     *
     * @return int
     * @author Wang Chen Chen<932560435@qq.com>
     * @date 2019/12/12 21:32
     */
    private int parentId;

    /**
     * 源属性
     *
     * @return int
     * @author Wang Chen Chen<932560435@qq.com>
     * @date 2019/12/12 21:32
     */
    private Object source;

    /**
     * 获取 所有子节点
     * @JsonInclude(JsonInclude.Include.NON_NULL)
     * @return int
     * @author Wang Chen Chen<932560435@qq.com>
     * @date 2019/12/12 21:32
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Set<TreeNode> children;

}
