package jm.dict.plugin.handle;

import jm.dict.plugin.entity.JMappingObject;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: AbstractDictDataHandler</p>
 * <p>描述: [字典数据抽象处理类]</p>
 * <p>创建时间: 2022/7/2 15:32</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/2 15:32] [Chen Yujie][init]
 */
public abstract class AbstractDictDataHandler {

    protected AbstractDictDataHandler nextHandelr;

    public abstract void doHandle(JMappingObject object) throws Exception;

    public static class Builder{
        private AbstractDictDataHandler head;

        public Builder nextHandler(AbstractDictDataHandler handler) {
            if (null == this.head) {
                this.head = handler;
                return this;
            }
            AbstractDictDataHandler node = this.head;
            while (node.nextHandelr != null) {
                node = node.nextHandelr;
            }
            node.nextHandelr = handler;
            return this;
        }

        public AbstractDictDataHandler build() {
            return this.head;
        }
    }
}
