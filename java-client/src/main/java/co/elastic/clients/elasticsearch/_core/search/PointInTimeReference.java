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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PointInTimeReference
@JsonpDeserializable
public final class PointInTimeReference implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String keepAlive;

	// ---------------------------------------------------------------------------------------------

	public PointInTimeReference(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.keepAlive = builder.keepAlive;

	}

	public PointInTimeReference(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
		return this.keepAlive;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PointInTimeReference}.
	 */
	public static class Builder implements ObjectBuilder<PointInTimeReference> {
		private String id;

		@Nullable
		private String keepAlive;

		/**
		 * Required - API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Builds a {@link PointInTimeReference}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PointInTimeReference build() {

			return new PointInTimeReference(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PointInTimeReference}
	 */
	public static final JsonpDeserializer<PointInTimeReference> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PointInTimeReference::setupPointInTimeReferenceDeserializer, Builder::build);

	protected static void setupPointInTimeReferenceDeserializer(
			DelegatingDeserializer<PointInTimeReference.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");

	}

}
