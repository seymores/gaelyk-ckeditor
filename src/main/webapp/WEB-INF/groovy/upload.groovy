
log.info " Upload params =>" + params 
def funcNum = params.CKEditorFuncNum
def ckeditor = params.CKEditor
def langCode = params.langCode

def message = ""

def blobs = blobstore.getUploadedBlobs(request)
def blob = blobs["upload"]

def url = "/image/${blob.getKeyString()}"

log.info " >> blob => " + url

String output ="""
<script type='text/javascript'>window.parent.CKEDITOR.tools.callFunction(${funcNum}, "${url}", "${message}");</script>
"""

out << output
