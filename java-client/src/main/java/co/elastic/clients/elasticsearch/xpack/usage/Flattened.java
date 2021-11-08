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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.Flattened
@JsonpDeserializable
public class Flattened extends Base {
	private final int fieldCount;

	// ---------------------------------------------------------------------------------------------

	private Flattened(Builder builder) {
		super(builder);

		this.fieldCount = ModelTypeHelper.requireNonNull(builder.fieldCount, this, "fieldCount");

	}

	public static Flattened of(Function<Builder, ObjectBuilder<Flattened>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field_count}
	 */
	public final int fieldCount() {
		return this.fieldCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field_count");
		generator.write(this.fieldCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Flattened}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Flattened> {
		private Integer fieldCount;

		/**
		 * Required - API name: {@code field_count}
		 */
		public final Builder fieldCount(int value) {
			this.fieldCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Flattened}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Flattened build() {
			_checkSingleUse();

			return new Flattened(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Flattened}
	 */
	public static final JsonpDeserializer<Flattened> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Flattened::setupFlattenedDeserializer, Builder::build);

	protected static void setupFlattenedDeserializer(DelegatingDeserializer<Flattened.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::fieldCount, JsonpDeserializer.integerDeserializer(), "field_count");

	}

}
