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

package co.elastic.clients.elasticsearch.security.suggest_user_profiles;

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

// typedef: security.suggest_user_profiles.Hint

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.suggest_user_profiles.Hint">API
 *      specification</a>
 */
@JsonpDeserializable
public class Hint implements JsonpSerializable {
	private final List<String> uids;

	private final Map<String, List<String>> labels;

	// ---------------------------------------------------------------------------------------------

	private Hint(Builder builder) {

		this.uids = ApiTypeHelper.unmodifiable(builder.uids);
		this.labels = ApiTypeHelper.unmodifiable(builder.labels);

	}

	public static Hint of(Function<Builder, ObjectBuilder<Hint>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A list of Profile UIDs to match against.
	 * <p>
	 * API name: {@code uids}
	 */
	public final List<String> uids() {
		return this.uids;
	}

	/**
	 * A single key-value pair to match against the labels section of a profile. A
	 * profile is considered matching if it matches at least one of the strings.
	 * <p>
	 * API name: {@code labels}
	 */
	public final Map<String, List<String>> labels() {
		return this.labels;
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

		if (ApiTypeHelper.isDefined(this.uids)) {
			generator.writeKey("uids");
			generator.writeStartArray();
			for (String item0 : this.uids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.labels)) {
			generator.writeKey("labels");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.labels.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link Hint}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Hint> {
		@Nullable
		private List<String> uids;

		@Nullable
		private Map<String, List<String>> labels;

		/**
		 * A list of Profile UIDs to match against.
		 * <p>
		 * API name: {@code uids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>uids</code>.
		 */
		public final Builder uids(List<String> list) {
			this.uids = _listAddAll(this.uids, list);
			return this;
		}

		/**
		 * A list of Profile UIDs to match against.
		 * <p>
		 * API name: {@code uids}
		 * <p>
		 * Adds one or more values to <code>uids</code>.
		 */
		public final Builder uids(String value, String... values) {
			this.uids = _listAdd(this.uids, value, values);
			return this;
		}

		/**
		 * A single key-value pair to match against the labels section of a profile. A
		 * profile is considered matching if it matches at least one of the strings.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>labels</code>.
		 */
		public final Builder labels(Map<String, List<String>> map) {
			this.labels = _mapPutAll(this.labels, map);
			return this;
		}

		/**
		 * A single key-value pair to match against the labels section of a profile. A
		 * profile is considered matching if it matches at least one of the strings.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds an entry to <code>labels</code>.
		 */
		public final Builder labels(String key, List<String> value) {
			this.labels = _mapPut(this.labels, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Hint}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hint build() {
			_checkSingleUse();

			return new Hint(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Hint}
	 */
	public static final JsonpDeserializer<Hint> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Hint::setupHintDeserializer);

	protected static void setupHintDeserializer(ObjectDeserializer<Hint.Builder> op) {

		op.add(Builder::uids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "uids");
		op.add(Builder::labels, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "labels");

	}

}
