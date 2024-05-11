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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.util.Objects;
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

// typedef: xpack.usage.Counter

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Counter">API
 *      specification</a>
 */
@JsonpDeserializable
public class Counter implements JsonpSerializable {
	private final long active;

	private final long total;

	// ---------------------------------------------------------------------------------------------

	protected Counter(AbstractBuilder<?> builder) {

		this.active = ApiTypeHelper.requireNonNull(builder.active, this, "active");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static Counter counterOf(Function<Builder, ObjectBuilder<Counter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active}
	 */
	public final long active() {
		return this.active;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
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

		generator.writeKey("active");
		generator.write(this.active);

		generator.writeKey("total");
		generator.write(this.total);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Counter}.
	 */

	public static class Builder extends Counter.AbstractBuilder<Builder> implements ObjectBuilder<Counter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Counter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Counter build() {
			_checkSingleUse();

			return new Counter(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Long active;

		private Long total;

		/**
		 * Required - API name: {@code active}
		 */
		public final BuilderT active(long value) {
			this.active = value;
			return self();
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final BuilderT total(long value) {
			this.total = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Counter}
	 */
	public static final JsonpDeserializer<Counter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Counter::setupCounterDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCounterDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::active, JsonpDeserializer.longDeserializer(), "active");
		op.add(AbstractBuilder::total, JsonpDeserializer.longDeserializer(), "total");

	}

}
