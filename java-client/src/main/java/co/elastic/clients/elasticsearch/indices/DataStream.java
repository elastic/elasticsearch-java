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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.DataStream
@JsonpDeserializable
public final class DataStream implements JsonpSerializable {
	@Nullable
	private final Boolean hidden;

	// ---------------------------------------------------------------------------------------------

	public DataStream(Builder builder) {

		this.hidden = builder.hidden;

	}

	public DataStream(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code hidden}
	 */
	@Nullable
	public Boolean hidden() {
		return this.hidden;
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

		if (this.hidden != null) {

			generator.writeKey("hidden");
			generator.write(this.hidden);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStream}.
	 */
	public static class Builder implements ObjectBuilder<DataStream> {
		@Nullable
		private Boolean hidden;

		/**
		 * API name: {@code hidden}
		 */
		public Builder hidden(@Nullable Boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * Builds a {@link DataStream}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStream build() {

			return new DataStream(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStream}
	 */
	public static final JsonpDeserializer<DataStream> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataStream::setupDataStreamDeserializer, Builder::build);

	protected static void setupDataStreamDeserializer(DelegatingDeserializer<DataStream.Builder> op) {

		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");

	}

}
