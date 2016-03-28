var browserSync = require('browser-sync');
var modRewrite = require('connect-modrewrite');
var gulp = require('gulp');

gulp.task('runserver', function() {
  browserSync({
    server: {
      baseDir: 'frontend',
      middleware: [
          modRewrite([
              '!\\.\\w+$ /index.html [L]'
          ])
      ]
    },
  })
});