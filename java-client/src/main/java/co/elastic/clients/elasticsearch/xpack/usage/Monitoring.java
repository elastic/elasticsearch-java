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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

// typedef: xpack.usage.Monitoring

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Monitoring">API
 *      specification</a>
 */
@JsonpDeserializable
public class Monitoring extends Base {
	private final boolean collectionEnabled;

	private final Map<String, Long> enabledExporters;

	// ---------------------------------------------------------------------------------------------

	private Monitoring(Builder builder) {
		super(builder);

		this.collectionEnabled = ApiTypeHelper.requireNonNull(builder.collectionEnabled, this, "collectionEnabled");
		this.enabledExporters = ApiTypeHelper.unmodifiableRequired(builder.enabledExporters, this, "enabledExporters");

	}

	public static Monitoring of(Function<Builder, ObjectBuilder<Monitoring>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code collection_enabled}
	 */
	public final boolean collectionEnabled() {
		return this.collectionEnabled;
	}

	/**
	 * Required - API name: {@code enabled_exporters}
	 */
	public final Map<String, Long> enabledExporters() {
		return this.enabledExporters;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("collection_enabled");
		generator.write(this.collectionEnabled);

		if (ApiTypeHelper.isDefined(this.enabledExporters)) {
			generator.writeKey("enabled_exporters");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.enabledExporters.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Monitoring}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Monitoring> {
		private Boolean collectionEnabled;

		private Map<String, Long> enabledExporters;

		/**
		 * Required - API name: {@code collection_enabled}
		 */
		public final Builder collectionEnabled(boolean value) {
			this.collectionEnabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code enabled_exporters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>enabledExporters</code>.
		 */
		public final Builder enabledExporters(Map<String, Long> map) {
			this.enabledExporters = _mapPutAll(this.enabledExporters, map);
			return this;
		}

		/**
		 * Required - API name: {@code enabled_exporters}
		 * <p>
		 * Adds an entry to <code>enabledExporters</code>.
		 */
		public final Builder enabledExporters(String key, Long value) {
			this.enabledExporters = _mapPut(this.enabledExporters, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Monitoring}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Monitoring build() {
			_checkSingleUse();

			return new Monitoring(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Monitoring}
	 */
	public static final JsonpDeserializer<Monitoring> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Monitoring::setupMonitoringDeserializer);

	protected static void setupMonitoringDeserializer(ObjectDeserializer<Monitoring.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::collectionEnabled, JsonpDeserializer.booleanDeserializer(), "collection_enabled");
		op.add(Builder::enabledExporters, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"enabled_exporters");

	}

}
