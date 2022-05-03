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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.FileDetails

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.recovery.FileDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileDetails implements JsonpSerializable {
	private final long length;

	private final String name;

	private final long recovered;

	// ---------------------------------------------------------------------------------------------

	private FileDetails(Builder builder) {

		this.length = ApiTypeHelper.requireNonNull(builder.length, this, "length");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.recovered = ApiTypeHelper.requireNonNull(builder.recovered, this, "recovered");

	}

	public static FileDetails of(Function<Builder, ObjectBuilder<FileDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code length}
	 */
	public final long length() {
		return this.length;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code recovered}
	 */
	public final long recovered() {
		return this.recovered;
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

		generator.writeKey("length");
		generator.write(this.length);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("recovered");
		generator.write(this.recovered);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FileDetails> {
		private Long length;

		private String name;

		private Long recovered;

		/**
		 * Required - API name: {@code length}
		 */
		public final Builder length(long value) {
			this.length = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code recovered}
		 */
		public final Builder recovered(long value) {
			this.recovered = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileDetails build() {
			_checkSingleUse();

			return new FileDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FileDetails}
	 */
	public static final JsonpDeserializer<FileDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileDetails::setupFileDetailsDeserializer);

	protected static void setupFileDetailsDeserializer(ObjectDeserializer<FileDetails.Builder> op) {

		op.add(Builder::length, JsonpDeserializer.longDeserializer(), "length");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::recovered, JsonpDeserializer.longDeserializer(), "recovered");

	}

}
