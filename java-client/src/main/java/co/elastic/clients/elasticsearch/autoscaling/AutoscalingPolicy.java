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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: autoscaling._types.AutoscalingPolicy

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#autoscaling._types.AutoscalingPolicy">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoscalingPolicy implements JsonpSerializable {
	private final List<String> roles;

	private final Map<String, JsonData> deciders;

	// ---------------------------------------------------------------------------------------------

	protected AutoscalingPolicy(AbstractBuilder<?> builder) {

		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.deciders = ApiTypeHelper.unmodifiableRequired(builder.deciders, this, "deciders");

	}

	public static AutoscalingPolicy autoscalingPolicyOf(Function<Builder, ObjectBuilder<AutoscalingPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - Decider settings
	 * <p>
	 * API name: {@code deciders}
	 */
	public final Map<String, JsonData> deciders() {
		return this.deciders;
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

		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.deciders)) {
			generator.writeKey("deciders");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.deciders.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingPolicy}.
	 */

	public static class Builder extends AutoscalingPolicy.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AutoscalingPolicy> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoscalingPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingPolicy build() {
			_checkSingleUse();

			return new AutoscalingPolicy(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<String> roles;

		private Map<String, JsonData> deciders;

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final BuilderT roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return self();
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final BuilderT roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return self();
		}

		/**
		 * Required - Decider settings
		 * <p>
		 * API name: {@code deciders}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>deciders</code>.
		 */
		public final BuilderT deciders(Map<String, JsonData> map) {
			this.deciders = _mapPutAll(this.deciders, map);
			return self();
		}

		/**
		 * Required - Decider settings
		 * <p>
		 * API name: {@code deciders}
		 * <p>
		 * Adds an entry to <code>deciders</code>.
		 */
		public final BuilderT deciders(String key, JsonData value) {
			this.deciders = _mapPut(this.deciders, key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingPolicy}
	 */
	public static final JsonpDeserializer<AutoscalingPolicy> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingPolicy::setupAutoscalingPolicyDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAutoscalingPolicyDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"roles");
		op.add(AbstractBuilder::deciders, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "deciders");

	}

}
