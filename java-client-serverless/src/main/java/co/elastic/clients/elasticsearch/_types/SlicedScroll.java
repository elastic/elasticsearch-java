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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SlicedScroll

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.SlicedScroll">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlicedScroll implements JsonpSerializable {
	@Nullable
	private final String field;

	private final String id;

	private final int max;

	// ---------------------------------------------------------------------------------------------

	private SlicedScroll(Builder builder) {

		this.field = builder.field;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");

	}

	public static SlicedScroll of(Function<Builder, ObjectBuilder<SlicedScroll>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final int max() {
		return this.max;
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

		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("max");
		generator.write(this.max);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlicedScroll}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlicedScroll> {
		@Nullable
		private String field;

		private String id;

		private Integer max;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(int value) {
			this.max = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlicedScroll}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlicedScroll build() {
			_checkSingleUse();

			return new SlicedScroll(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlicedScroll}
	 */
	public static final JsonpDeserializer<SlicedScroll> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlicedScroll::setupSlicedScrollDeserializer);

	protected static void setupSlicedScrollDeserializer(ObjectDeserializer<SlicedScroll.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::max, JsonpDeserializer.integerDeserializer(), "max");

	}

}
