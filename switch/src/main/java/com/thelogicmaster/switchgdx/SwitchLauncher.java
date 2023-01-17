package com.thelogicmaster.switchgdx;

import com.badlogic.gdx.Files;
import com.shatteredpixel.shatteredpixeldungeon.ShatteredPixelDungeon;
import com.shatteredpixel.shatteredpixeldungeon.services.news.News;
import com.shatteredpixel.shatteredpixeldungeon.services.news.NewsImpl;
import com.shatteredpixel.shatteredpixeldungeon.services.updates.UpdateImpl;
import com.shatteredpixel.shatteredpixeldungeon.services.updates.Updates;
import com.watabou.noosa.Game;
import com.watabou.utils.FileUtils;

public class SwitchLauncher {

	public static void main (String[] arg) {
		Game.version = "1.4.3";
		Game.versionCode = 668;

//		if (UpdateImpl.supportsUpdates()){
//			Updates.service = UpdateImpl.getUpdateService();
//		}
		if (NewsImpl.supportsNews()){
			News.service = NewsImpl.getNewsService();
		}

		FileUtils.setDefaultFileProperties(Files.FileType.Local, "");

		new SwitchApplication(new ShatteredPixelDungeon(new SwitchPlatformSupport()));
	}
}
