/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link ContentObject} variants.
 */
public class ContentObjectBuilders {
	private ContentObjectBuilders() {
	}

	/**
	 * Creates a builder for the {@link FileContentPart file} {@code ContentObject}
	 * variant.
	 */
	public static FileContentPart.Builder file() {
		return new FileContentPart.Builder();
	}

	/**
	 * Creates a ContentObject of the {@link FileContentPart file}
	 * {@code ContentObject} variant.
	 */
	public static ContentObject file(Function<FileContentPart.Builder, ObjectBuilder<FileContentPart>> fn) {
		ContentObject.Builder builder = new ContentObject.Builder();
		builder.file(fn.apply(new FileContentPart.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ImageUrlContent image_url}
	 * {@code ContentObject} variant.
	 */
	public static ImageUrlContent.Builder imageUrl() {
		return new ImageUrlContent.Builder();
	}

	/**
	 * Creates a ContentObject of the {@link ImageUrlContent image_url}
	 * {@code ContentObject} variant.
	 */
	public static ContentObject imageUrl(Function<ImageUrlContent.Builder, ObjectBuilder<ImageUrlContent>> fn) {
		ContentObject.Builder builder = new ContentObject.Builder();
		builder.imageUrl(fn.apply(new ImageUrlContent.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextContent text} {@code ContentObject}
	 * variant.
	 */
	public static TextContent.Builder text() {
		return new TextContent.Builder();
	}

	/**
	 * Creates a ContentObject of the {@link TextContent text} {@code ContentObject}
	 * variant.
	 */
	public static ContentObject text(Function<TextContent.Builder, ObjectBuilder<TextContent>> fn) {
		ContentObject.Builder builder = new ContentObject.Builder();
		builder.text(fn.apply(new TextContent.Builder()).build());
		return builder.build();
	}

}
