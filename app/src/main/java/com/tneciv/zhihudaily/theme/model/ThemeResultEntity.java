package com.tneciv.zhihudaily.theme.model;

import java.util.List;

/**
 * Created by Tneciv on 2-12-0012.
 */
public class ThemeResultEntity {
    public static class ThemeList {
        private List<ThemeEntity> entities;

        public ThemeList(List<ThemeEntity> entities) {
            this.entities = entities;
        }

        public List<ThemeEntity> getEntities() {
            return entities;
        }

        public void setEntities(List<ThemeEntity> entities) {
            this.entities = entities;
        }
    }

}
