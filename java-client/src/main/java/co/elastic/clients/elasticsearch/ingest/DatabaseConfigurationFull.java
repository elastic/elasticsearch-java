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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
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

// typedef: ingest._types.DatabaseConfigurationFull

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.DatabaseConfigurationFull">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatabaseConfigurationFull
		implements
			TaggedUnion<DatabaseConfigurationFull.Kind, Object>,
			JsonpSerializable {

	/**
	 * {@link DatabaseConfigurationFull} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ingest._types.DatabaseConfigurationFull">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Web("web"),

		Local("local"),

		Maxmind("maxmind"),

		Ipinfo("ipinfo"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final String name;

	private DatabaseConfigurationFull(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static DatabaseConfigurationFull of(Function<Builder, ObjectBuilder<DatabaseConfigurationFull>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The provider-assigned name of the IP geolocation database to
	 * download.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Is this variant instance of kind {@code web}?
	 */
	public boolean isWeb() {
		return _kind == Kind.Web;
	}

	/**
	 * Get the {@code web} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code web} kind.
	 */
	public Web web() {
		return TaggedUnionUtils.get(this, Kind.Web);
	}

	/**
	 * Is this variant instance of kind {@code local}?
	 */
	public boolean isLocal() {
		return _kind == Kind.Local;
	}

	/**
	 * Get the {@code local} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code local} kind.
	 */
	public Local local() {
		return TaggedUnionUtils.get(this, Kind.Local);
	}

	/**
	 * Is this variant instance of kind {@code maxmind}?
	 */
	public boolean isMaxmind() {
		return _kind == Kind.Maxmind;
	}

	/**
	 * Get the {@code maxmind} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code maxmind} kind.
	 */
	public Maxmind maxmind() {
		return TaggedUnionUtils.get(this, Kind.Maxmind);
	}

	/**
	 * Is this variant instance of kind {@code ipinfo}?
	 */
	public boolean isIpinfo() {
		return _kind == Kind.Ipinfo;
	}

	/**
	 * Get the {@code ipinfo} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ipinfo} kind.
	 */
	public Ipinfo ipinfo() {
		return TaggedUnionUtils.get(this, Kind.Ipinfo);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DatabaseConfigurationFull> {
		private Kind _kind;
		private Object _value;

		private String name;

		/**
		 * Required - The provider-assigned name of the IP geolocation database to
		 * download.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder web(Web v) {
			this._kind = Kind.Web;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder web(Function<Web.Builder, ObjectBuilder<Web>> fn) {
			return this.web(fn.apply(new Web.Builder()).build());
		}

		public ContainerBuilder local(Local v) {
			this._kind = Kind.Local;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder local(Function<Local.Builder, ObjectBuilder<Local>> fn) {
			return this.local(fn.apply(new Local.Builder()).build());
		}

		public ContainerBuilder maxmind(Maxmind v) {
			this._kind = Kind.Maxmind;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder maxmind(Function<Maxmind.Builder, ObjectBuilder<Maxmind>> fn) {
			return this.maxmind(fn.apply(new Maxmind.Builder()).build());
		}

		public ContainerBuilder ipinfo(Ipinfo v) {
			this._kind = Kind.Ipinfo;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder ipinfo(Function<Ipinfo.Builder, ObjectBuilder<Ipinfo>> fn) {
			return this.ipinfo(fn.apply(new Ipinfo.Builder()).build());
		}

		public DatabaseConfigurationFull build() {
			_checkSingleUse();
			return new DatabaseConfigurationFull(this);
		}

		public class ContainerBuilder implements ObjectBuilder<DatabaseConfigurationFull> {

			/**
			 * Required - The provider-assigned name of the IP geolocation database to
			 * download.
			 * <p>
			 * API name: {@code name}
			 */
			public final ContainerBuilder name(String value) {
				Builder.this.name = value;
				return this;
			}

			public DatabaseConfigurationFull build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupDatabaseConfigurationFullDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::web, Web._DESERIALIZER, "web");
		op.add(Builder::local, Local._DESERIALIZER, "local");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::maxmind, Maxmind._DESERIALIZER, "maxmind");
		op.add(Builder::ipinfo, Ipinfo._DESERIALIZER, "ipinfo");

	}

	public static final JsonpDeserializer<DatabaseConfigurationFull> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatabaseConfigurationFull::setupDatabaseConfigurationFullDeserializer, Builder::build);
}