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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: xpack.usage.Audit

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Audit">API
 *      specification</a>
 */
@JsonpDeserializable
public class Audit extends FeatureToggle {
	private final List<String> outputs;

	// ---------------------------------------------------------------------------------------------

	private Audit(Builder builder) {
		super(builder);

		this.outputs = ApiTypeHelper.unmodifiable(builder.outputs);

	}

	public static Audit of(Function<Builder, ObjectBuilder<Audit>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code outputs}
	 */
	public final List<String> outputs() {
		return this.outputs;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.outputs)) {
			generator.writeKey("outputs");
			generator.writeStartArray();
			for (String item0 : this.outputs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Audit}.
	 */

	public static class Builder extends FeatureToggle.AbstractBuilder<Builder> implements ObjectBuilder<Audit> {
		@Nullable
		private List<String> outputs;

		/**
		 * API name: {@code outputs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>outputs</code>.
		 */
		public final Builder outputs(List<String> list) {
			this.outputs = _listAddAll(this.outputs, list);
			return this;
		}

		/**
		 * API name: {@code outputs}
		 * <p>
		 * Adds one or more values to <code>outputs</code>.
		 */
		public final Builder outputs(String value, String... values) {
			this.outputs = _listAdd(this.outputs, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Audit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Audit build() {
			_checkSingleUse();

			return new Audit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Audit}
	 */
	public static final JsonpDeserializer<Audit> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Audit::setupAuditDeserializer);

	protected static void setupAuditDeserializer(ObjectDeserializer<Audit.Builder> op) {
		FeatureToggle.setupFeatureToggleDeserializer(op);
		op.add(Builder::outputs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"outputs");

	}

}
