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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: watcher._types.DataEmailAttachment

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.DataEmailAttachment">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataEmailAttachment implements EmailAttachmentVariant, JsonpSerializable {
	@Nullable
	private final DataAttachmentFormat format;

	// ---------------------------------------------------------------------------------------------

	private DataEmailAttachment(Builder builder) {

		this.format = builder.format;

	}

	public static DataEmailAttachment of(Function<Builder, ObjectBuilder<DataEmailAttachment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * EmailAttachment variant kind.
	 */
	@Override
	public EmailAttachment.Kind _emailAttachmentKind() {
		return EmailAttachment.Kind.Data;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final DataAttachmentFormat format() {
		return this.format;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.format != null) {
			generator.writeKey("format");
			this.format.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataEmailAttachment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataEmailAttachment> {
		@Nullable
		private DataAttachmentFormat format;

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable DataAttachmentFormat value) {
			this.format = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataEmailAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataEmailAttachment build() {
			_checkSingleUse();

			return new DataEmailAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataEmailAttachment}
	 */
	public static final JsonpDeserializer<DataEmailAttachment> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataEmailAttachment::setupDataEmailAttachmentDeserializer);

	protected static void setupDataEmailAttachmentDeserializer(ObjectDeserializer<DataEmailAttachment.Builder> op) {

		op.add(Builder::format, DataAttachmentFormat._DESERIALIZER, "format");

	}

}
