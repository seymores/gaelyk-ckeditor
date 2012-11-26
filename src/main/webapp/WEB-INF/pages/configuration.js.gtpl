
//<![CDATA[

// Replace the <textarea id="editor"> with an CKEditor
// instance, using default configurations.
CKEDITOR.replace( 'editor1',
        {
extraPlugins : 'uicolor',
filebrowserUploadUrl : "${blobstore.createUploadUrl('/upload.groovy')}"
});

//]]>
